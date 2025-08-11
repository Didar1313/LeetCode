
## SQL Query: Retrieve Person Information with Optional Address

### Problem
We have two tables:

**Person**
| Column Name | Type    |
|-------------|---------|
| personId    | int     |
| lastName    | varchar |
| firstName   | varchar |

- `personId` is the primary key.
- Contains personal information.

**Address**
| Column Name | Type    |
|-------------|---------|
| addressId   | int     |
| personId    | int     |
| city        | varchar |
| state       | varchar |

- `addressId` is the primary key.
- Contains address details linked to `personId` in the Person table.

### Goal
Report the first name, last name, city, and state of each person.  
If a person's address is not present, display `NULL` for the city and state.

---

### SQL Solution
```sql
SELECT 
    p.firstName, 
    p.lastName, 
    a.city, 
    a.state
FROM Person p
LEFT JOIN Address a
    ON p.personId = a.personId;
````

---

### Explanation

* **LEFT JOIN**: Ensures all rows from `Person` are returned, even if there's no matching address.
* **ON p.personId = a.personId**: Matches each person with their corresponding address.
* **NULL Values**: If no matching row is found in `Address`, `city` and `state` will be `NULL`.

---
