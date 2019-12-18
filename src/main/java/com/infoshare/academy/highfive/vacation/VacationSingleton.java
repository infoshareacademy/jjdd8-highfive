package com.infoshare.academy.highfive.vacation;

import com.infoshare.academy.highfive.holiday.InitException;

import java.io.IOException;
import java.util.List;

public class VacationSingleton {

        VacationJsonParser vacationJsonParser;

        private static VacationSingleton instance;
        private List<Vacation> vacationList;

        private VacationSingleton() {
            vacationJsonParser = new VacationJsonParser();
        }

        public static synchronized VacationSingleton getInstance() {
            if (instance == null) {
                instance = new VacationSingleton();
            }
            return instance;
        }

    private void validateVacation() {
        if (vacationList == null) {
            throw new InitException();
        }
    }

    public List<Vacation> getAllVacation() {
        validateVacation();
        return this.vacationList;
    }

        public void initFromFile(String fileName) throws IOException {
            vacationList = vacationJsonParser.parseFromFile(fileName);
        }

        public void initSaveToFile(String filename) {
            vacationJsonParser.saveToFile(filename, vacationList);
        }

        public List<Vacation> getVacationList() {
            return vacationList;
        }

        public void insertVacation(Vacation vacation){
            vacationList.add(vacation);
        }

        public void deleteVacation(Integer vacationID){
            vacationList.remove(vacationID);

    }

}