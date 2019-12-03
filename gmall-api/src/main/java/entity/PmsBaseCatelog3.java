package entity;

import java.io.Serializable;

public class PmsBaseCatelog3 implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_base_catalog3.id
     *
     * @mbggenerated Mon Dec 02 13:23:40 CST 2019
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_base_catalog3.name
     *
     * @mbggenerated Mon Dec 02 13:23:40 CST 2019
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_base_catalog3.catalog2_id
     *
     * @mbggenerated Mon Dec 02 13:23:40 CST 2019
     */
    private Long catalog2Id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pms_base_catalog3
     *
     * @mbggenerated Mon Dec 02 13:23:40 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_base_catalog3.id
     *
     * @return the value of pms_base_catalog3.id
     *
     * @mbggenerated Mon Dec 02 13:23:40 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_base_catalog3.id
     *
     * @param id the value for pms_base_catalog3.id
     *
     * @mbggenerated Mon Dec 02 13:23:40 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_base_catalog3.name
     *
     * @return the value of pms_base_catalog3.name
     *
     * @mbggenerated Mon Dec 02 13:23:40 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_base_catalog3.name
     *
     * @param name the value for pms_base_catalog3.name
     *
     * @mbggenerated Mon Dec 02 13:23:40 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_base_catalog3.catalog2_id
     *
     * @return the value of pms_base_catalog3.catalog2_id
     *
     * @mbggenerated Mon Dec 02 13:23:40 CST 2019
     */
    public Long getCatalog2Id() {
        return catalog2Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_base_catalog3.catalog2_id
     *
     * @param catalog2Id the value for pms_base_catalog3.catalog2_id
     *
     * @mbggenerated Mon Dec 02 13:23:40 CST 2019
     */
    public void setCatalog2Id(Long catalog2Id) {
        this.catalog2Id = catalog2Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_base_catalog3
     *
     * @mbggenerated Mon Dec 02 13:23:40 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", catalog2Id=").append(catalog2Id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_base_catalog3
     *
     * @mbggenerated Mon Dec 02 13:23:40 CST 2019
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        PmsBaseCatelog3 other = (PmsBaseCatelog3) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCatalog2Id() == null ? other.getCatalog2Id() == null : this.getCatalog2Id().equals(other.getCatalog2Id()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_base_catalog3
     *
     * @mbggenerated Mon Dec 02 13:23:40 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCatalog2Id() == null) ? 0 : getCatalog2Id().hashCode());
        return result;
    }
}