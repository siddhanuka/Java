package com.conversion.service;

import java.awt.List;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.conversion.entity.FacilityEntity;
import com.opencsv.CSVReader;

public class AddService {

	public void parsefile() throws IOException {

//	List<FacilityEntity> beans = new CsvToBeanBuilder(FileReader("yourfile.csv"));
//	CsvToBean csvToBean = CsvToBeanBuilder(new FileReader("yourfile.csv")).withSeparator('\t').build();	
//	List<myBean> beans = new CsvToBeanBuilder(FileReader("yourfile.csv")).withType(FacilityEntity.class).build().parse();
	

	CSVReader reader = null;
	
	try {
		reader = new CSVReader(new FileReader("fac.csv"));
		
//		reader.
		String[] line;
		
		while((line = reader.readNext()) != null){
			System.out.println(line[0] + line[1] + line[2]+ line[3]+ line[4]+ line[5]+ line[6]+ line[7]+ line[8]+ line[9]+ line[10]+ line[11]);
		}
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	
	}

}
