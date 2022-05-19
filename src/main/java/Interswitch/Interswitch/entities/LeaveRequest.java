package Interswitch.Interswitch.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import Interswitch.Interswitch.interfaces.NotEmpty;

@Entity@Table(name ="user")
// @Table(name="leaveRequest")
public class LeaveRequest {
    @Id
    @Column(nullable = false)
    private String leaveId;

    private Date leaveStart;

    private Date leaveEnd;

    // @ManyToOne(optional = false)
    // @JoinColumn(name = "employee", nullable = false, referencedColumnName = "id")
    // private User user;

    public LeaveRequest(String leaveId, Date leaveStart, Date leaveEnd) {

        this.leaveId = leaveId;
        this.leaveStart = leaveStart;
        this.leaveEnd = leaveEnd;
    }

    public Date getLeaveEnd() {
        return leaveEnd;
    }

    public void setLeaveEnd(Date leaveEnd) {
        this.leaveEnd = leaveEnd;
    }

    public String getLeaveId() {
        return leaveId;
    }

    public void setLeaveId(String leaveId) {
        this.leaveId = leaveId;
    }

    public Date getLeaveStart() {
        return leaveStart;
    }

    public void setLeaveStart(Date leaveStart) {
        this.leaveStart = leaveStart;
    }

}
