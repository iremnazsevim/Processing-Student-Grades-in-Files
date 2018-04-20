import java.io.File;

import java.io.FileNotFoundException;

import java.io.PrintStream;

import java.util.Scanner;


    public class Lab6 {


        public static void main(String[] args) throws FileNotFoundException {


            computeGPAs("grades.txt", "gpa.txt");

        }


        /**
         * This method is used to read student grades from the input file
         * <p>
         * and computes/writes the student GPAs in the output file 
         * <p>
         *  
         * <p>
         * Input file format is:	StudentID  Course1 Course1Credit Course1Grade  . . . 
         * <p>
         * Output file format is: 	StudentID	GPA
         * <p>
         *  
         *
         * @param inputFileName  the name of the input file 
         * @param outputFileName the name of the output file 
         *                       <p>
         *                        
         */

        private static void computeGPAs(String inputFileName, String outputFileName)

                throws FileNotFoundException {
            Scanner file=new Scanner(new File(inputFileName));

            PrintStream out=new PrintStream(new File(outputFileName));





          

            double credit=0;
            double note=0;

            while (file.hasNextLine()) {
                double sum=0;
                double sumNote=0;
                String line = file.nextLine();
                Scanner input = new Scanner(line);
                int id = input.nextInt();
                while (input.hasNext()) {

                    if (input.hasNextDouble()) {
                         credit = input.nextDouble();
                         note = input.nextDouble();

                        sum = sum + credit;
                        sumNote = sumNote + (credit * note);
                    }
                    else{
                    input.next();

                }

            }out.printf("%d %.2f\n", id, (sumNote / sum));
        }

    }
    }