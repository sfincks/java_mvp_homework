import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {
    Groups groups = new Groups();
    private final Scanner scanner;
    public View() {

        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("""
                    ������ ��������� ������:
                    1. �������� ������
                    2. �������� ���� �����
                    3. �������� ��������� � ������
                    4. ��������� ���� ��������� � ������
                    5. �����
                    ������� ����� �������:
                    """);
            String command = scanner.nextLine();

            if ("1".equals(command)) {
                System.out.println("������� �������� ������");
                String groupName = scanner.nextLine();
                StudGroup group = new StudGroup(groupName);
                groups.addGroup(group);
            } else if ("2".equals(command)) {
                System.out.println(groups.getGroups());
            } else if ("3".equals(command)) {
                System.out.println("��������� ������ � ������� ������ �������� ��������");
                System.out.println(groups.getGroups());
                String groupName = scanner.nextLine();
                System.out.println("������� ��� ��������");
                String studName = scanner.nextLine();
                groups.addingStudents(groupName,studName);
            } else if ("4".equals(command)) {
                System.out.println("��������� ������");
                String groupName = scanner.nextLine();
                groups.getAllStudsInGroup(groupName);
            } else if ("5".equals(command)) {
                break;
            }
        }
    }
}

