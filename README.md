# โปรเจค: ระบบ API สำหรับ SSO Test

## ภาพรวม
โปรเจคนี้เป็นแอปพลิเคชัน **Spring Boot** ที่ใช้ในการจัดการการสร้างโทเค็นสำหรับผู้ใช้ โดยใช้ฐานข้อมูล **PostgreSQL** สำหรับการจัดเก็บข้อมูลและใช้ **Swagger** สำหรับการทดสอบ API หลัก ซึ่งจะทำการรับคำขอ POST เพื่อบันทึกข้อมูลผู้ใช้ลงในตาราง `SSO_USER_TEST` ในฐานข้อมูล

## ข้อกำหนดเบื้องต้น
- **Java JDK** เวอร์ชัน 17 หรือสูงกว่า
- **Spring Boot Framework** เวอร์ชัน 3.3 หรือสูงกว่า
- **PostgreSQL Database** เวอร์ชัน 12 หรือสูงกว่า

## การตั้งค่าฐานข้อมูล
### การตั้งค่าฐานข้อมูล PostgreSQL:
- **โฮสต์**: localhost
- **พอร์ต**: 5432
- **ฐานข้อมูล**: ssotest
- **ชื่อผู้ใช้**: ssodev
- **รหัสผ่าน**: sso2022ok

### การตั้งค่าตาราง:
รัน SQL script ด้านล่างในฐานข้อมูล PostgreSQL เพื่อสร้างตาราง:

```sql
CREATE TABLE sso_user_test (
    request_date TIMESTAMP NOT NULL PRIMARY KEY,
    ssotype VARCHAR(50),
    systemid VARCHAR(50),
    systemname VARCHAR(250),
    systemtransactions VARCHAR(250),
    systemprivileges VARCHAR(250),
    systemusergroup VARCHAR(50),
    systemlocationgroup VARCHAR(50),
    userid VARCHAR(200),
    userfullname VARCHAR(500),
    userrdofficecode VARCHAR(250),
    userofficecode VARCHAR(250),
    clientlocation VARCHAR(250),
    locationmachinenumber VARCHAR(500),
    tokenid VARCHAR(1000)
);
