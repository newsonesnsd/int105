package building;
import java.util.Objects;

public class Room {
    private String roomName;

    public Room(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    @Override
    public String toString() {
        return "Room{" + "roomName=" + roomName + '}';
    }
    
    public boolean equals(Object obj){
        boolean result = false;
        if(obj!=null&&obj instanceof Room){
            Room rm =(Room)obj;
            if(roomName.equals(rm.roomName)){
                result =true;
            }
        }
        return result;
    }
}
