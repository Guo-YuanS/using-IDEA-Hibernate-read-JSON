package cn;

import javax.persistence.*;

@Entity
@Table(name="oberon", schema="test")
public class OberonEntity {
    private int id;
    private String name;
    private String spaIp;
    private String spbIp;
    private String bmcaIp;
    private String bmcbIp;
    private String owner;
    private String date;
    private String mode;
    private Integer version;

    @Id
    @Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id=id;
    }

    @Basic
    @Column(name="NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    @Basic
    @Column(name="SPA_IP")
    public String getSpaIp() {
        return spaIp;
    }

    public void setSpaIp(String spaIp) {
        this.spaIp=spaIp;
    }

    @Basic
    @Column(name="SPB_IP")
    public String getSpbIp() {
        return spbIp;
    }

    public void setSpbIp(String spbIp) {
        this.spbIp=spbIp;
    }

    @Basic
    @Column(name="BMCA_IP")
    public String getBmcaIp() {
        return bmcaIp;
    }

    public void setBmcaIp(String bmcaIp) {
        this.bmcaIp=bmcaIp;
    }

    @Basic
    @Column(name="BMCB_IP")
    public String getBmcbIp() {
        return bmcbIp;
    }

    public void setBmcbIp(String bmcbIp) {
        this.bmcbIp=bmcbIp;
    }

    @Basic
    @Column(name="OWNER")
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner=owner;
    }

    @Basic
    @Column(name="DATE")
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date=date;
    }

    @Basic
    @Column(name="MODE")
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode=mode;
    }

    @Basic
    @Column(name="version")
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version=version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OberonEntity that=(OberonEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (spaIp != null ? !spaIp.equals(that.spaIp) : that.spaIp != null) return false;
        if (spbIp != null ? !spbIp.equals(that.spbIp) : that.spbIp != null) return false;
        if (bmcaIp != null ? !bmcaIp.equals(that.bmcaIp) : that.bmcaIp != null) return false;
        if (bmcbIp != null ? !bmcbIp.equals(that.bmcbIp) : that.bmcbIp != null) return false;
        if (owner != null ? !owner.equals(that.owner) : that.owner != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (mode != null ? !mode.equals(that.mode) : that.mode != null) return false;
        if (version != null ? !version.equals(that.version) : that.version != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result=id;
        result=31 * result + (name != null ? name.hashCode() : 0);
        result=31 * result + (spaIp != null ? spaIp.hashCode() : 0);
        result=31 * result + (spbIp != null ? spbIp.hashCode() : 0);
        result=31 * result + (bmcaIp != null ? bmcaIp.hashCode() : 0);
        result=31 * result + (bmcbIp != null ? bmcbIp.hashCode() : 0);
        result=31 * result + (owner != null ? owner.hashCode() : 0);
        result=31 * result + (date != null ? date.hashCode() : 0);
        result=31 * result + (mode != null ? mode.hashCode() : 0);
        result=31 * result + (version != null ? version.hashCode() : 0);
        return result;
    }
}
