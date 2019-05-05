public class Main {

    public static void main(String[] args) {

        Course courseList[] = new Course[8];
        courseList[0] = new Course("English III", "Ms. Lapan");
        courseList[1] = new Course("Precalculus", "Mrs. Gideon");
        courseList[2] = new Course("Music Theory", "Mr. Davis");
        courseList[3] = new Course("Biotechnology", "Ms. Palmer");
        courseList[4] = new Course("Principals of Technology I", "Ms. Garcia");
        courseList[5] = new Course("Latin", "Mrs. Barnett");
        courseList[6] = new Course("AP Us History", "Ms. Johannessen");
        courseList[7] = new Course("Business Computer Information Systems", "Mr. James");

        Course.getInfo(courseList);


    }

}
