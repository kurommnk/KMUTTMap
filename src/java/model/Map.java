/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Meow
 */
public class Map {

    private int mapId;
    private String mapName;

    public Map() {
    }

    public Map(int mapId, String mapName) {
        this.mapId = mapId;
        this.mapName = mapName;
    }

    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public int getMapId() {
        return mapId;
    }

    public void setMapId(int mapId) {
        this.mapId = mapId;
    }

    @Override
    public String toString() {
        return "Map Name: " + mapName;
    }

    public static void orm(ResultSet rs, Map m) throws ClassNotFoundException, SQLException {
        m.setMapId(rs.getInt("MAPID"));
        m.setMapName(rs.getString("MAPNAME"));

    }
    String SQL;

    public Building findById(int id) {
        SQL = "select * from BUILDING where BUILDID like ?";
        Building build = null;
        Connection conn;
        try {
            conn = ConnectionBuilder.connect();
            PreparedStatement ps = conn.prepareStatement(SQL);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                build = new Building();
                build.orm(rs, build);
            }
            conn.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Map.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Map.class.getName()).log(Level.SEVERE, null, ex);
        }

        return build;
    }

    public Building findByName(String name) {

        //String sql = "SELECT * from BUILDING where BUILDNAME like ?";
        SQL = "SELECT * from BUILDING where BUILDNAME_ENG like ?";
        Building build = null;
        Connection conn;
        try {
            conn = ConnectionBuilder.connect();
            PreparedStatement ps = conn.prepareStatement(SQL);
            switch (name) {
                case "อาคารสัมมนา":
                    name = "NSemina";
                    break;
                case "อาคารวัตกรรมการเรียนรู้เฉลิมพระเกียรติ 80 พรรษา":
                    name = "Darunsikkh";
                    break;
                case "อาคารวิศววัฒนะ":
                    name = "Engineering Bui";
                    break;
                case "บ้านธรรมรักษา2":
                    name = "Dhammaraksa Residence Hall 2";
                    break;
                case "หอชาย":
                    name = "Dhammaraksa Residence Hall 2";
                    break;
                case "เบ้านธรรมรักษา1":
                    name = "Dhammaraksa Residence Hall 1";
                    break;
                case "หอหญิง":
                    name = "Dhammaraksa Residence Hall 1";
                    break;
                case "อาคารโรงประลองเทคโนโลยีและวัสดุ":
                    name = "Energy and Materials W";
                    break;
                case "อาคารเรียนและปฏิบัติการคณะพลังงานสิ่งแวดล้อมและวัสดุ":
                    name = "School of Energy, Environment and Mat";
                    break;
                case "อาคารเรียนรวม3":
                    name = "Building 3";
                    break;
                case "อาคารเรียนรวม4":
                    name = "Building 4";
                    break;
                case "อาคารเรียนรวม5":
                    name = "Building 5";
                    break;
                case "อาคารวิศวกรรมเคมี":
                    name = "Chemical En";
                    break;
                case "อาคารวิศวกรรมเครื่องกล":
                    name = "chanical ENG";
                    break;
                case "อาคารจอดรถ":
                    name = "Dioro Building";
                    break;
                case "อาคารสูง 14 ชั้น":
                    name = "Dioro Building";
                    break;
                case "สำนักงานเทคโนโลยี":
                    name = "UTO";
                    break;
                case "อาคารสำนักงานอธิการบดี":
                    name = "Office of The Pr";
                    break;

                case "Green Society":
                    name = "Green Society Build";
                    break;
                case "สำนักงานอาคารและสถานที่":
                    name = "Building and Grounds Divis";
                    break;
                case "อาคารปฏิบัติการทางวิศวกรรมอุตสาหการ5":
                    name = "Production EN";
                    break;
                case "อาคารเรียนรวม1":
                    name = "Building 1";
                    break;
                case "อาคารเรียนรวม2":
                    name = "Building 2";
                    break;
                case "อาคารพระจอมเกล้าราชานุสรณ์190ปี":
                    name = "King Mongkut Mem";
                    break;
                case "โรงอาหาร":
                    name = "King Mongkut Mem";
                    break;
                case "อาคารไฟฟ้าแรงสูง":
                    name = "Hi-Voltage Buil";
                    break;
                case "อาคารโรงแยกขยะ":
                    name = "Recyc";
                    break;
                case "ศูนย์ซ่อมบำรุง":
                    name = "Maintenance and Se";
                    break;
                case "อาคารเรือนอนุบาลต้นไม้":
                    name = "Nursery";
                    break;
                case "อาคารเรียนและปฏิบัติการทางศิลปศาสตร์":
                    name = "School of Liberal Art";
                    break;
                case "อาคารภาควิชาเคมี":
                    name = "Chemistry Departme";
                    break;
                case "อาคารภาควิชาฟิสิกส์":
                    name = "epartment of Physic";
                    break;
                case "อาคารภาคคณิตศาสตร์":
                    name = "Department of Mathe";
                    break;
                case "อาคารศูนย์เครื่องมือวิทยาศาสตร์":
                    name = "Scientic Ins";
                    break;
                case "อาคารภาควิชาจุลชีววิทยา":
                    name = "Microbiolog";
                    break;
                case "อาคารปฏิบัติการพื้นฐานทางวิทยาศาสตร์":
                    name = "Fundamental Sci";
                    break;
                case "สำนักหอสมุด":
                    name = "Library";
                    break;
                case "หอสมุด":
                    name = "Library";
                    break;
                case "อาคารคณะเทคโนโลยีสารสนเทศ":
                    name = "School of Information Tech";
                    break;
                case "สถาบันวิทยาการหุ่นยนต์ภาคสนาม":
                    name = "Roboti";
                    break;
                default:
                    System.out.print("error");
                    break;
            }
            ps.setString(1, "%" + name + "%");

            ResultSet rs = ps.executeQuery();
            System.out.println("before loop");

            while (rs.next()) {
                System.out.println("Loop");
                build = new Building();
                build.orm(rs, build);
            }
            conn.close();

        } catch (Exception ex) {
            Logger.getLogger(Map.class.getName()).log(Level.SEVERE, null, ex);
        }

        return build;
    }

    public Map putData(int id) {
        Map map = null;
        String SQL = "select * from MAP where MAPID like ?";
        Connection conn;
        try {
            conn = ConnectionBuilder.connect();
            PreparedStatement ps = conn.prepareStatement(SQL);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                map = new Map();
                map.mapOrm(rs, map);

            }

        } catch (Exception ex) {
            Logger.getLogger(Map.class.getName()).log(Level.SEVERE, null, ex);
        }

        return map;
    }

    public static Map mapOrm(ResultSet rs, Map m) throws ClassNotFoundException, SQLException {
        m.setMapId(rs.getInt("MAPID"));
        m.setMapName(rs.getString("MAPNAME"));

        return m;

    }

    public boolean check(String param) {
        boolean check = false;
        String sub = param.substring(0, 1);
        try {
            int parseint = Integer.parseInt(sub);

            for (int i = 0; i < 37; i++) {
                if (parseint == i) {
                    check = true;
                }
            }
        } catch (Exception e) {
            System.out.println("It's String");

        }

        return check;
    }

    public List<Building> checkRestroomZone(String number) {
        List<Building> builds = null;
        Building build = null;
        Map m = new Map(1, "BANGMOD");
        System.out.println("check  zone");
        System.out.println("number: "+number);
        if (number.equals("1")) {
            System.out.println("number 1");
            builds = new ArrayList();
            String[] numInMap = {"8", "9"};
            for (int i = 0; i < numInMap.length; i++) {
                System.out.println("for loop");
                build = new Building();
                build = m.findById(Integer.parseInt(numInMap[i]));
                if(build!=null){
                    System.out.println("not null eiei");
                }else{
                    System.out.println("null eiei");
                }
                if (builds == null) {
                    builds = new ArrayList();
                }
                builds.add(build);
            }
        } else if (number.equals("2")) {
            builds = new ArrayList();
            String[] numInMap = {"1", "3", "4", "5", "10"};
            for (int i = 0; i < numInMap.length; i++) {
                build = new Building();
                build = m.findById(Integer.parseInt(numInMap[i]));
                if (builds == null) {
                    builds = new ArrayList();
                }
                builds.add(build);
            }
        } else if (number.equals("3")) {
            builds = new ArrayList();
            String[] numInMap = {"14", "20", "21", "27"};
            for (int i = 0; i < numInMap.length; i++) {
                build = new Building();
                build = m.findById(Integer.parseInt(numInMap[i]));
                if (builds == null) {
                    builds = new ArrayList();
                }
                builds.add(build);

            }
        } else if (number.equals("4")) {
            builds = new ArrayList();
            String[] numInMap = {"28", "29", "33"};
            for (int i = 0; i < numInMap.length; i++) {
                build = new Building();
                build = m.findById(Integer.parseInt(numInMap[i]));
                if (builds == null) {
                    builds = new ArrayList();
                }
                builds.add(build);

            }
        }
        return builds;
    }
    
    public List<Building> checkRestaurantZone(String number) {
        List<Building> builds = null;
        Building build = null;
        Map m = new Map(1, "BANGMOD");
        System.out.println("check  zone");
        System.out.println("number: "+number);
        if (number.equals("11")) {            
            builds = new ArrayList();
            String[] numInMap = {"22"};
            for (int i = 0; i < numInMap.length; i++) {                
                build = new Building();
                build = m.findById(Integer.parseInt(numInMap[i]));
                if(build!=null){
                    System.out.println("not null eiei");
                }else{
                    System.out.println("null eiei");
                }
                if (builds == null) {
                    builds = new ArrayList();
                }
                builds.add(build);
            }
        } else if (number.equals("22")) {
            builds = new ArrayList();
            String[] numInMap = {"4", "5", "13"};
            for (int i = 0; i < numInMap.length; i++) {
                build = new Building();
                build = m.findById(Integer.parseInt(numInMap[i]));
                if (builds == null) {
                    builds = new ArrayList();
                }
                builds.add(build);
            }
        } else if (number.equals("33")) {
            builds = new ArrayList();
            String[] numInMap = {"20","27"};
            for (int i = 0; i < numInMap.length; i++) {
                build = new Building();
                build = m.findById(Integer.parseInt(numInMap[i]));
                if (builds == null) {
                    builds = new ArrayList();
                }
                builds.add(build);

            }
        } else if (number.equals("44")) {
            builds = new ArrayList();
            String[] numInMap = {"33","34"};
            for (int i = 0; i < numInMap.length; i++) {
                build = new Building();
                build = m.findById(Integer.parseInt(numInMap[i]));
                if (builds == null) {
                    builds = new ArrayList();
                }
                builds.add(build);

            }
        }
        return builds;
    }
}
