//) URL parser: Write a program that extracts the domain name from a given URL
//URL Parser: Test Case 1: Input: " https://www.example.com/path/to/page"
//Expected Output: "www.example.com”
//Test Case 2: Input: " "subdomain.example.co.uk" Expected output: “subdomain.example.co.uk”
//Test Case 3: Input: Input: "ftp://ftp.example.net/file.zip" Expected Output: "ftp.example.net"
//Test Case 4: Input: "http://localhost:8080" Expected Output: "localhost"
//Test Case 5: Input: “ https://www.example.com:8080” Expected output: “www.example.com”

package day9;

import java.util.Scanner;

public class UrlParse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String URL:");
		String url = sc.nextLine();
		String domain = "";

		if (url != null && !url.isEmpty()) {
			url = url.trim();
			if (url.startsWith("http://")) {
				url = url.substring(7);
			} else if (url.startsWith("https://")) {
				url = url.substring(8);
			} else if (url.startsWith("ftp://")) {
				url = url.substring(6);
			}

			int endIndex = url.indexOf('/');
			if (endIndex == -1) {
				endIndex = url.length();
			}

			int portIndex = url.indexOf(':');
			if (portIndex != -1 && portIndex < endIndex) {
				domain = url.substring(0, portIndex);
			} else {
				domain = url.substring(0, endIndex);
			}
		}

		System.out.println("Domain Name: " + domain);
	}
}
