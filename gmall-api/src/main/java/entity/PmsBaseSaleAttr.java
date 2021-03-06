package entity;

import java.io.Serializable;

public class PmsBaseSaleAttr implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_base_sale_attr.id
     *
     * @mbggenerated Wed Dec 04 14:44:38 CST 2019
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_base_sale_attr.name
     *
     * @mbggenerated Wed Dec 04 14:44:38 CST 2019
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pms_base_sale_attr
     *
     * @mbggenerated Wed Dec 04 14:44:38 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_base_sale_attr.id
     *
     * @return the value of pms_base_sale_attr.id
     *
     * @mbggenerated Wed Dec 04 14:44:38 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_base_sale_attr.id
     *
     * @param id the value for pms_base_sale_attr.id
     *
     * @mbggenerated Wed Dec 04 14:44:38 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_base_sale_attr.name
     *
     * @return the value of pms_base_sale_attr.name
     *
     * @mbggenerated Wed Dec 04 14:44:38 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_base_sale_attr.name
     *
     * @param name the value for pms_base_sale_attr.name
     *
     * @mbggenerated Wed Dec 04 14:44:38 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_base_sale_attr
     *
     * @mbggenerated Wed Dec 04 14:44:38 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_base_sale_attr
     *
     * @mbggenerated Wed Dec 04 14:44:38 CST 2019
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
        PmsBaseSaleAttr other = (PmsBaseSaleAttr) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_base_sale_attr
     *
     * @mbggenerated Wed Dec 04 14:44:38 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        return result;
    }
}