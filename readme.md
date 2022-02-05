# Basic Java
![Roadmap](https://github.com/hieuvu98/java-basics/blob/master/images/java-developer-roadmap.png?raw=true)
## Java Collection Framework
### Interfaces of Collections FrameWork
![Image](https://github.com/hieuvu98/java-basics/blob/master/images/collection-framework-hierarchy-in-java.jpg?raw=true)
### Comparable & Comparator
### Map Interface
<b>Interface Map<K,V></b>  
Type Parameters:  
K - the type of keys maintained by this map  
V - the type of mapped values  
- Map được sử dụng để lưu trữ và truy xuất dữ liệu dưới dạng key - value. Map không được chưa giá trị trùng lặp, mỗi key 
được liên kết đến một giá trị duy nhất. Mỗi cặp key - value được gọi là entry.
- Để sử dụng cá chức năng của Map Interface chúng ta có thể sử dụng các class: HashMap, LinkedHashMap, TreeMap
- Các phương thức hay dùng của Map:

| Phương thức                              | Mô tả                                                                                          |
|:-----------------------------------------|:-----------------------------------------------------------------------------------------------|
| void clear()                             | Xóa tất cả các phần có trong Map                                                               |
| put (K, V)                               | Chèn liên kết của key K và value V vào map. Nếu key đã có sẵn, value mới sẽ thay thế value cũ. |
| putAll(Map<? extends K,? extends V> m)   | Copy tất cả các mục từ map chỉ định vào map hiện tại                                           |
| get(Object key)                          | Trả về value được liên kết với key, hoặc trả về null nếu không tìm key                         |
| getOrDefault(Object key, V defaultValue) | Trả về value được liên kết với key, hoặc trả về defaultValue nếu không tìm thấy key            |
| Set keySet()                             | Trả về một Set chưa tất cả các keys trong Map                                                  |
| Set<Map.Entry<K,V>> entrySet()           | Trả về một Set chưa tất cả các keys và values trong Map                                        |
| boolean containsKey(Object key)          | Trả về true nếu trong Map có chứa key được chỉ định                                            |
| boolean containsValue(Object value)      | Trả về true nếu trong Map có chứa value được chỉ định                                          |
| int size()                               | Trả về kích thước của Map                                                                      |
| boolean isEmpty()                        | Trả về True nếu Map không chứa cặp key-value                                                   |
| V remove(Object key)                     | Trả về Value và xóa một phần tử có key được chỉ định ra khỏi Map                               |
| V replace(K key, V value)                | Thay thế value liên kết với Key được chỉ định bằng một value mới                               |

### Set Interface
- Set là một collection không thể chứa các phần tử trùng lặp
- 