# PayMe-API-Project
This is an API project for the PayMe App made with Java Springboot.

The following endpoints have been created

## Person
- <strong>Create/Register person</strong>
  <br/>Request type: POST

    Request Endpoint:
    ```
    /person/add/
    ```

    Request body: 
    ```
    {"name": "name_to_register" }
    ```
    RESPONSE 
    ```
    {
    
    }
    ```

- <strong>View all persons</strong>
  Request type: GET

  Request Endpoint
  ```
  /person/getAll/
  ```

  Request body: NONE

  RESPONSE:
  ```
  [
  {
  "id": "a90bb5ad-9053-4cb4-8b68-9f769991bb78",
  "name": "Test User1"
  },
  {
  "id": "o30bb5ad-9056-4ui4-8b68-184539991bb26",
  "name": "Test User2"
  }
  ]
  ```
