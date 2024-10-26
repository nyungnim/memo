# Memo

## Overview
This project is a simple CRUD (Create, Read, Update, Delete) application for managing notes,
built with Spring Boot. It provides RESTful APIs.


## Note Features
1. **View All Notes Upon Access**
    - Retrieves and displays a list of all notes using the `GET` API.

2. **Create Note**
    - Adds a new note using the `POST` API.
    - Returns the newly created note upon success.

3. **Update Note**
    - Modifies an existing note using the `PUT` API.
    - Checks if the selected note exists in the database before updating its content.

4. **Delete Note**
    - Removes an existing note using the `DELETE` API.
    - Verifies the note's existence in the database before deletion.