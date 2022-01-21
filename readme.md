# Basic Java

## Java Collection Framework
### Interfaces of Collections FrameWork
![Image](https://github.com/hieuvu98/java-basics/blob/master/images/collection-framework-hierarchy-in-java.jpg?raw=true)
### Comparable & Comparator
### Map Interface
- Map được sử dụng để lưu trữ và truy xuất dữ liệu dưới dạng key - value. Map không được chưa giá trị trùng lặp, mỗi key 
được liên kết đến một giá trị duy nhất. Mỗi cặp key - value được gọi là entry.
- Các phương thức hay dùng của Map:

| Phương thức       | Mô tả                                                                                                |
|:------------------|:-----------------------------------------------------------------------------------------------------|
| put (K, V)        | Chèn liên kết của key K và value V vào map. Nếu key đã có sẵn, value mới sẽ thay thế value cũ.       |