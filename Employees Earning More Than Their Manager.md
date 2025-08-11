## **SQL Solution: Find Employees Who Earn More Than Their Managers**

### Problem

We have an **Employee** table:

| Column Name | Type    |
| ----------- | ------- |
| id          | int     |
| name        | varchar |
| salary      | int     |
| managerId   | int     |

* `id` is the primary key.
* `managerId` is the **id** of the employee’s direct manager (also in the same table).
* We need to find employees whose **salary** is greater than their manager’s salary.

---

### SQL Query

```sql
SELECT e.name AS Employee
FROM Employee e
JOIN Employee m
    ON e.managerId = m.id
WHERE e.salary > m.salary;
```

---

### How It Works

1. **Self Join**:

   * `Employee e` represents employees.
   * `Employee m` represents their managers (also from the same table).
2. **ON e.managerId = m.id**: Matches each employee to their manager based on IDs.
3. **WHERE e.salary > m.salary**: Filters for employees earning more than their manager.
4. **SELECT e.name AS Employee**: Returns only the employee name.

---

### Example

**Input Table:**

| id | name  | salary | managerId |
| -- | ----- | ------ | --------- |
| 1  | Joe   | 70000  | 3         |
| 2  | Henry | 80000  | 4         |
| 3  | Sam   | 60000  | NULL      |
| 4  | Max   | 90000  | NULL      |

**Output:**

| Employee |
| -------- |
| Joe      |

---

