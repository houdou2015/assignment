import java.io.*;

public class Files_Test {
	// 创建文件
	public static void createFile() throws IOException { // throws
															// IOException：创建文件时是异常处理
		File file = new File("f:\\test.txt");
		boolean isSucess = file.createNewFile();
		if (isSucess) {
			System.out.println("a new file has created!");
		} else {
			System.out.println("file has exits");
		}
	}

	// 删除文件
	public static void deleteFile() {
		File file = new File("test.txt");
		boolean isSuccess = file.delete();
		if (isSuccess) {
			System.out.println("text.txt has been deleted!");
		} else {
			System.out.println("text.txt not has been deleted!");
		}
	}

	// 读文件
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

	// 写文件
	public static void writeFile() throws IOException {
		String s = "床前明月光\r\n疑是地上霜\r\n举头望明月\r\n低头思故乡\r\n";
		System.out.println(s.length());
		File file = new File("F:" + File.separator + "text.txt");
		OutputStream yy = new FileOutputStream(file);

		yy.write(s.getBytes(), 0, s.getBytes().length); // 把字符串转换成字节，写入文件
		yy.close();
		System.out.println("文件写入成功！");
	}

	public static void main(String[] args) throws IOException {
		createFile();
		writeFile();
		readFile();
		deleteFile();
	}
}
