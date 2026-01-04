package com.tcs.hibernate_mapping.controller;

import com.tcs.hibernate_mapping.dao.PersonAdharDao;

public class DeleteAdharNumberByAdharNumberController {
	public static void main(String[] args) {
		new PersonAdharDao().deleteAdharByAdharNumberDao(67565758);
	}

}
