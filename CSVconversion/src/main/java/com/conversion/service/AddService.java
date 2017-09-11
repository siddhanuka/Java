package com.conversion.service;

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conversion.entity.FacilityEntity;
import com.conversion.repository.UserRepository;
import com.opencsv.CSVReader;

@Service
public class AddService {

	@Autowired	
	UserRepository userRepo;
	
	public void parsefile(String file) throws IOException {

//	List<FacilityEntity> beans = new CsvToBeanBuilder(FileReader("yourfile.csv"));
//	CsvToBean csvToBean = CsvToBeanBuilder(new FileReader("yourfile.csv")).withSeparator('\t').build();	
//	List<myBean> beans = new CsvToBeanBuilder(FileReader("yourfile.csv")).withType(FacilityEntity.class).build().parse();
	
//	CSVReader reader = null;	
		
	try {
/*		reader = new CSVReader(new FileReader("fac.csv"));
		
		String[] line;
		
		while((line = reader.readNext()) != null){
			System.out.println(line[0] + line[1] + line[2]+ line[3]+ line[4]+ line[5]+ line[6]+ line[7]+ line[8]+ line[9]+ line[10]);
		}
*/		
//		FacilityEntity fac = new FacilityEntity();
		String location = "C:" + File.separator + "Java" + File.separator + "CSVconversion" + File.separator + file + ".csv";
		
		File facFile = new File(location);
		
		Scanner facScanner = new Scanner(facFile);
		
		
		while (facScanner.hasNextLine()) {

			String nextLine = facScanner.nextLine();
			
			String []faccolumns = nextLine.split("\t", 10);
			
			int id = Integer.parseInt(faccolumns[0]);
			
			if (faccolumns[7].isEmpty()) {
				faccolumns[7] = "N";
			}
			if (faccolumns[8].isEmpty()) {
				faccolumns[8] = "N";
			}
			if (faccolumns[9].isEmpty()) {
				faccolumns[9] = "N";
			}
			
			FacilityEntity fac = new FacilityEntity(id, faccolumns[1], faccolumns[2], faccolumns[3], faccolumns[4], faccolumns[5], faccolumns[6], faccolumns[7], faccolumns[8], faccolumns[9]);
			
	/*		fac.setId(id);
			
			fac.setName(faccolumns[1]);
			fac.setCode(faccolumns[2]);
			fac.setAddress(faccolumns[3]);
			fac.setCity(faccolumns[4]);
			fac.setState(faccolumns[5]);
			fac.setZip(faccolumns[6]);
			
			if (faccolumns[7] != (null) || faccolumns[7].isEmpty() ){
				fac.setPhone(faccolumns[7]);
			}
			
			if (faccolumns[8] != (null) || faccolumns[8].isEmpty() ){
				fac.setNote(faccolumns[8]);
			}
			
			if (faccolumns[9] != (null) || faccolumns[9].isEmpty() ){
				int facType = Integer.parseInt(faccolumns[9]);
				fac.setFacilityType(facType);
			}
	
			if (faccolumns[10] != (null) || faccolumns[10].isEmpty() ){
				fac.setRobotFlag(faccolumns[10]);
			}
			*/
			
			userRepo.save(fac);
		
		}
		
//		faccolumns.toString();
		
		
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	
	}

}
