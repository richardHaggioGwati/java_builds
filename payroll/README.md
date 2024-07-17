
---

# PayrollApplication

Welcome to the PayrollApplication repository! This project is a Java-based application designed to manage payroll
processing efficiently.

## Features

- **Employee ID Generation:** Utilizes a unique ID generation system to ensure each employee has a unique identifier.
- **Payroll Calculation:** Calculates payroll based on employee data.
- **Data Storage:** Stores employee and payroll data securely.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 11 or higher
- Maven 3.6.0 or higher

### Installation

1. Clone the repository:
    ```bash
    $ git clone https://github.com/richardHaggioGwati/java_builds.git
    ```
2. Navigate to the payroll directory:
    ```bash
    $ cd java_builds/payroll
    ```
3. Build the project using Maven:
    ```bash
    $ mvn clean install
    ```

### Usage

To run the application, execute the following command within the root of the api:

```bash
$ ./mvnw clean spring-boot:run
```

Alternatively, you can use your installed Maven version, as follows:

```bash
$ mvn clean spring-boot:run
```

## Testing

### Employees

After having run the application, here are some ways you can test the api:

```bash
$ curl -v localhost:8080/employees
```

Display curl output in readable JSON format in Unix shell script with `nodejs` and `bash`:

```bash
$ curl -v localhost:8080/employees | node -p "JSON.stringify( JSON.parse(require('fs').readFileSync(0) ), 0, 1 )"
```

When you do so, you get the following output:

### Details

```bash
{
 "_embedded": {
  "employeeList": [
   {
    "id": 1,
    "firstName": "Bilbo",
    "lastName": "Baggins",
    "name": "Bilbo Baggins",
    "role": "security",
    "_links": {
     "self": {
      "href": "http://localhost:8080/employees/1"
     },
     "employees": {
      "href": "http://localhost:8080/employees"
     }
    }
   },
   {
    "id": 2,
    "firstName": "Frodo",
    "lastName": "Baggins",
    "name": "Frodo Baggins",
    "role": "security",
    "_links": {
     "self": {
      "href": "http://localhost:8080/employees/2"
     },
     "employees": {
      "href": "http://localhost:8080/employees"
     }
    }
   }
  ]
 },
 "_links": {
  "self": {
   "href": "http://localhost:8080/employees"
  }
 }
}
```

To create a new Employee record, use the following command in a terminal:

```bash
$ curl -X POST localhost:8080/employees -H 'Content-type:application/json' -d '{"name": "Samwise Gamgee", "role": "gardener"}'
```

Then it stores the newly created employee and sends it back to us:

```bash
{"id":3,"firstName":"Samwise","lastName":"Gamgee","name":"Samwise Gamgee","role":"gardener","_links":{"self":{"href":"http://localhost:8080/employees/3"},"employees":{"href":"http://localhost:8080/employees"}}}
```
You can update the user. For example, you can change the role:
```bash
$ curl -X PUT localhost:8080/employees/3 -H 'Content-type:application/json' -d '{"name": "Samwise Gamgee", "role": "ring bearer"}'
```

Finally, you can delete users, as follows:
```bash
$ curl -X DELETE localhost:8080/employees/3

# Now if we look again, it's gone
$ curl localhost:8080/employees/3
Could not find employee with id=3
```

### Orders

Testing orders with preloaded data:

```bash
$ curl -v http://localhost:8080/orders | node -p "JSON.stringify( JSON.parse(require('fs').readFileSync(0) ), 0, 1 )"
```

#### Details

```bash
{
 "_embedded": {
  "orderList": [
   {
    "id": 1,
    "description": "MacBook Pro",
    "status": "COMPLETED",
    "_links": {
     "self": {
      "href": "http://localhost:8080/orders/1"
     },
     "orders": {
      "href": "http://localhost:8080/orders"
     }
    }
   },
   {
    "id": 2,
    "description": "iPhone",
    "status": "IN_PROGRESS",
    "_links": {
     "self": {
      "href": "http://localhost:8080/orders/2"
     },
     "orders": {
      "href": "http://localhost:8080/orders"
     },
     "cancel": {
      "href": "http://localhost:8080/orders/2/cancel"
     },
     "complete": {
      "href": "http://localhost:8080/orders/2/complete"
     }
    }
   }
  ]
 },
 "_links": {
  "self": {
   "href": "http://localhost:8080/orders"
  }
 }
}
```

This [HAL](https://stateless.co/hal_specification.html) document immediately shows different links for each order, based upon its present state.
* The first order, being `COMPLETED`, only has the navigational links. The state transition links are not shown.
* The second order, being `IN_PROGRESS`, additionally has the cancel link as well as the complete link.

Now try cancelling an order:
```bash
$ curl -v -X DELETE http://localhost:8080/orders/2/cancel | node -p "JSON.stringify( JSON.parse(require('fs').readFileSync(0) ), 0, 1 )"
```

### Details

```bash
> DELETE /orders/2/cancel HTTP/1.1
> Accept: */*
>
* Request completely sent off
< HTTP/1.1 200
< Content-Type: application/hal+json
< Transfer-Encoding: chunked
< Date: Jul 2024  GMT
{
 "id": 2,
 "description": "iPhone",
 "status": "CANCELLED",
 "_links": {
  "self": {
   "href": "http://localhost:8080/orders/2"
  },
  "orders": {
   "href": "http://localhost:8080/orders"
  }
 }
}
```

Now you can try running the same operation again:
```bash
$ curl -v -X DELETE http://localhost:8080/orders/2/cancel | node -p "JSON.stringify( JSON.parse(require('fs').readFileSync(0) ), 0, 1 )"
```

### Details

```bash
< HTTP/1.1 405
< Content-Type: application/problem+json
< Transfer-Encoding: chunked
< Date: Wed, Jul 2024 GMT
<
{ [110 bytes data]
* Request completely sent off
100    99    0    99    0     0   2250      0 --:--:-- --:--:-- --:--:--  2475
* Connection #0 to host localhost left intact
{
 "title": "Method not allowed",
 "detail": "You can't cancel an order that is in the CANCELLED status"
}
```
You can see an HTTP `405` Method Not Allowed response. `DELETE` has become an invalid operation. 
The Problem response object clearly indicates that you are not allowed to "cancel" an order already in the `CANCELLED` status.

## Contributing

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Open a Pull Request.

## Contact

For questions or feedback, please reach out.

---

Happy Coding!🚀