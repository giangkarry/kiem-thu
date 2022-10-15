# BT Kiem thu

## Bài toán
  Viết chương trình tính mức hưởng lương hưu của quân nhân chuyên nghiệp nam với các thông tin mức bình quân tiền lương tháng đóng bảo hiểm xã hội, tuổi khi nghỉ hưu và số năm đóng bảo hiểm xã hội

## Mô tả sơ bộ
  Quân nhân nghỉ hưu phải đủ (47-56) tuổi và phải có 20 năm đóng bảo hiểm xã hội trở lên mới đủ điều kiện hưởng lương hưu (thực tế có một số ngoại lệ khác nhưng không xét trong bài làm). Tùy theo thời gian đóng BHXH và mức bình quân tiền lương tháng đóng BHXH mà mức lương hưu sẽ khác nhau đối với mỗi người.

## Các điều kiện giả định đặt ra: 
1. Mức hưởng lương hưu của quân nhân chuyên nghiệp hàng tháng = Tỷ lệ hưởng lương hưu hàng tháng * mức bình quân tiền lương tháng đóng BHXH
2. Đóng bhxh đủ 20 năm thì tỷ lệ lương hưu là 45%, sau đó cứ mỗi năm đóng thì tỷ lệ lương hưu sẽ tăng thêm 2% nhưng tối đa là 75%.

## Đầu vào: 
-	Tuổi khi nghỉ hưu (int, 0 <= tuoi_nghi <= 56) (tuổi)
-	Số năm đóng bảo hiểm xã hội (int, 0 <= nam_bhxh <= 100) (năm)
-	Mức bình quân tiền lương tháng đóng BHXH (int, 0 <= tien_luong <= 29800000) (đồng)

## Đầu ra: 
Mức hưởng lương hưu hàng tháng
 
## Cách tính:
1: Nếu tuổi nghỉ hưu < 47 tuổi và số năm đóng bảo hiểm xã hội < 20 năm thì mức hương lương hưu hàng tháng nhận được = 0 => sang bước 3
2: Tính mức lương hưu nhận được
2.1. Tỷ lệ lương hưu = max ((0.45 + (số năm đóng bảo hiểm xã hội – 20) * 0.02), 075)
2.2. Mức tiền lương nhận được = tỷ lệ lương hưu * mức bình quân tháng đóng bảo hiểm xã hội
3. Kết thúc chương trình

