package pojos;

/**
 * User generated by java
 */
public class User  implements java.io.Serializable {


     private Integer id;
     private String username;
     private String nickname;
     private String email;
     private byte[] avatar;
     private int isDeleted;
     private String password;
     private int roleId;

    public User() {
    }

	
    public User(String username, String nickname, String email, int isDeleted, String password, int roleId) {
        this.username = username;
        this.nickname = nickname;
        this.email = email;
        this.isDeleted = isDeleted;
        this.password = password;
        this.roleId = roleId;
    }
    public User(String username, String nickname, String email, byte[] avatar, int isDeleted, String password, int roleId) {
       this.username = username;
       this.nickname = nickname;
       this.email = email;
       this.avatar = avatar;
       this.isDeleted = isDeleted;
       this.password = password;
       this.roleId = roleId;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getNickname() {
        return this.nickname;
    }
    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public byte[] getAvatar() {
        return this.avatar;
    }
    
    public void setAvatar(byte[] avatar) {
        this.avatar = avatar;
    }
    public int getIsDeleted() {
        return this.isDeleted;
    }
    
    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public int getRoleId() {
        return this.roleId;
    }
    
    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }


}

