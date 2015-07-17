import java.io.*;

public class Files_Test {
	// �����ļ�
	public static void createFile() throws IOException { // throws
															// IOException�������ļ�ʱ���쳣����
		File file = new File("f:\\test.txt");
		boolean isSucess = file.createNewFile();
		if (isSucess) {
			System.out.println("a new file has created!");
		} else {
			System.out.println("file has exits");
		}
	}

	// ɾ���ļ�
	public static void deleteFile() {
		File file = new File("test.txt");
		boolean isSuccess = file.delete();
		if (isSuccess) {
			System.out.println("text.txt has been deleted!");
		} else {
			System.out.println("text.txt not has been deleted!");
		}
	}

	// ���ļ�
	public static void readFile() throws IOException {
		File file = new File("F:" + File.separator + "test.txt");
		InputStream in = new FileInputStream(file);
		char[] chars = new char[1024];
		int len = 0;
		for (int i = 0; i < 1024; i++) {
			int x = in.read();
			if (x == -1) {
				len = i;
				break;
			}
			chars[i] = (char) x;
		}
		for (int i = 0; i < len; i++) {
			System.out.print(chars[i]);
		}
		in.close();
	}

	// д�ļ�
	public static void writeFile() throws IOException {
		String s = "��ǰ���¹�\r\n���ǵ���˪\r\n��ͷ������\r\n��ͷ˼����\r\n";
		System.out.println(s.length());
		File file = new File("F:" + File.separator + "text.txt");
		OutputStream yy = new FileOutputStream(file);

		yy.write(s.getBytes(), 0, s.getBytes().length); // ���ַ���ת�����ֽڣ�д���ļ�
		yy.close();
		System.out.println("�ļ�д��ɹ���");
	}

	public static void main(String[] args) throws IOException {
		createFile();
		writeFile();
		readFile();
		deleteFile();
	}
}
