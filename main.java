import java.sql.Date;

import javax.swing.SwingConstants;

public class main {
	public static void main(String[] args) {

		Department dep1 = new Department(1, "Phong Ky Thuat 1");
		Department dep2 = new Department(2, "Phong Ky Thuat 2");
		Department dep3 = new Department(3, "Phong Dev 1");
		Department dep4 = new Department(4, "Phong Dev 2");
		Department dep5 = new Department(5, "Phong Sale");
		Department dep6 = new Department(6, "Phong Marketing");
		Department dep7 = new Department(7, "Phong Giam Doc");
		Department dep8 = new Department(8, "Phong Tai Chinh");

//		=========================================================

		Position pos1 = new Position(1, PosName.DEV);
		Position pos2 = new Position(2, PosName.PM);
		Position pos3 = new Position(3, PosName.TEST);
		Position pos4 = new Position(4, PosName.SCRUM_MASTER);

//		=========================================================

		Group group1 = new Group(1, "nhóm 1", new Date(2019, 10, 04));
		Group group2 = new Group(2, "nhóm 2", new Date(2015, 10, 04));
		Group group3 = new Group(3, "nhóm 3", new Date(2013, 10, 04));
		Group group4 = new Group(4, "nhóm 4", new Date(2011, 10, 04));
		Group group5 = new Group(5, "nhóm 5", new Date(2019, 10, 04));
		Group group6 = new Group(6, "nhóm 6", new Date(2021, 10, 04));
		Group group7 = new Group(7, "nhóm 7", new Date(2020, 10, 04));

//	    ==========================================================

		Account acc1 = new Account();
		acc1.id = 1;
		acc1.email = "vti_account1@vtiacademy.com";
		acc1.userName = "vti1";
		acc1.fullName = "Nguyen Van Tinh";
		Group[] groupAccount1 = { group1, group2 };
		acc1.groups = groupAccount1;
		acc1.department = dep1;
		acc1.pos = pos1;

		Account acc2 = new Account();
		acc2.id = 2;
		acc2.email = "vti_account2@vtiacademy.com";
		acc2.userName = "vti2";
		acc2.fullName = "Trinh Hoai Linh";
		Group[] groupAccount2 = { group3, group2 };
		acc2.groups = groupAccount2;
		acc2.department = dep2;
		acc2.pos = pos2;

		Account acc3 = new Account();
		acc3.id = 3;
		acc3.email = "vti_account3@vtiacademy.com";
		acc3.userName = "vti3";
		acc3.fullName = "Nguyen Van Test";
		Group[] groupAccount3 = { group1, group3 };
		acc3.groups = groupAccount3;
		acc3.department = dep3;
		acc3.pos = pos3;

		Account acc4 = new Account();
		acc4.id = 4;
		acc4.email = "vti_account4@vtiacademy.com";
		acc4.userName = "vti4";
		acc4.fullName = "Cao Thai Son";
		Group[] groupAccount4 = { group1, group3 };
		acc4.groups = groupAccount4;
		acc4.department = dep4;
		acc4.pos = pos4;
//		add acc in group
		group1.accouns = new Account[] { acc1, acc3, acc4 };

//		Kiểm tra account thứ 2
//		Nếu không có phòng ban (tức là department == null) thì sẽ in ra text
//		"Nhân viên này chưa có phòng ban"
//		Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là ..."
		System.out.println("Question1================================if");
		if (acc2.department == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		} else {
			System.out.println("Phòng ban của nhân viên này là : " + acc2.department.name);
		}

//		Kiểm tra account thứ 2
//		Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
//		Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên
//		này là Java Fresher, C# Fresher"
//		Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người
//		quan trọng, tham gia nhiều group"
//		Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là
//		người hóng chuyện, tham gia tất cả các group"
		System.out.println("Question2================================if");
		if (acc2.groups == null) {
			System.out.println("Nhân viên này chưa có group");
		} else {
			int totalgroup = acc2.groups.length;
			if (totalgroup <= 2) {
				System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
			}
			if (totalgroup == 3) {
				System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			}
			if (totalgroup == 4) {
				System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
			}
		}
		System.out.println("Question3================================ternary");
		System.out.println(acc2.department == null ? "Nhân viên này chưa có phòng ban"
				: "Phòng ban của nhân viên này là :" + acc2.department.name);

//Sử dụng toán tử ternary để làm yêu cầu sau:
//Kiểm tra Position của account thứ 1
//Nếu Position = Dev thì in ra text "Đây là Developer"
//Nếu không phải thì in ra text "Người này không phải là Developer"
		System.out.println("Question4==============================ternary");
		System.out
				.println(acc1.pos.name.toString() == "DEV" ? "Đây là Developer" : "Người này không phải là Developer");

//		Question 5:
//			Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
//			Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
//			Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
//			Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
//			Còn lại in ra "Nhóm có nhiều thành viên"
		System.out.println("Question5=====================Switch case");

		if (group1 == null) {
			System.out.println("nhom khong co thanh vien");
		} else {
			int totalacc = group1.accouns.length;
			switch (totalacc) {
			case 1:
				System.out.println("1 thì in ra \"Nhóm có một thành viên");

				;
				break;
			case 2:
				System.out.println("Nhóm có hai thành viên");

				;
				break;
			case 3:
				System.out.println("Nhóm có ba thành viên");

				;
				break;

			default:
				System.out.println("Nhóm có nhiều thành viên");
				break;
			}
		}

//		Question 6:
//			Sử dụng switch case để làm lại Question 2
//		Kiểm tra account thứ 2
//		Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
//		Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên
//		này là Java Fresher, C# Fresher"
//		Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người
//		quan trọng, tham gia nhiều group"
//		Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là
//		người hóng chuyện, tham gia tất cả các group"
		System.out.println("question6=============================Switch case ");
		if (acc2.pos == null) {
			System.out.println("Nhân viên này chưa có group");
		} else {
			int accofgroup = acc2.groups.length;
			switch (accofgroup) {
			case 1:
				System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
				break;
			case 2:
				System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
				break;
			case 3:
				System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
				break;

			default:
				System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
				break;
			}

		}
		//Sử dụng toán tử ternary để làm yêu cầu sau:
		//Kiểm tra Position của account thứ 1
		//Nếu Position = Dev thì in ra text "Đây là Developer"
		//Nếu không phải thì in ra text "Người này không phải là Developer"
System.out.println("question7=================================Switch case");
String posname=acc1.pos.toString();
switch (posname) {
case "DEV": {System.out.println("Đây là Developer");

	
}
default:
	System.out.println("Người này không phải là Developer");
	break;
}
	}

}
