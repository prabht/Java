package com.psl.EA103;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;



public class EA3 implements Runnable {

	public static void main(String[] args) {

		EA3 s = new EA3();
		Thread t1 = new Thread(s, "number.txt");
		// Thread t2 = new Thread(s, "Factorial");

		t1.start();

	}

	@Override
	public void run() {

		// TODO Auto-generated method stub
		if (Thread.currentThread().getName().equals("number.txt")) {
			File f = new File(Thread.currentThread().getName());

			FileInputStream fis;

			try {
				fis = new FileInputStream(f);
				BufferedReader br = new BufferedReader(new InputStreamReader(
						fis));
				String t;
				int n = 0;
				while ((t = br.readLine()) != null) {
					n = Integer.parseInt(t);
					// notify();
					// System.out.println(Integer.parseInt(t));
					EA3 f1 = new EA3();
					Thread t2 = new Thread(f1, t);
					t2.start();

				}

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {

			// System.out.println(Thread.currentThread().getName());
			long f = 1;
			for (int i = Integer.parseInt(Thread.currentThread().getName()); i > 0; i--) {
				f *= i;
			}
			System.out.println(f);

		}

	}

}
