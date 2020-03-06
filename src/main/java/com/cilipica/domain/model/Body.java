package com.cilipica.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * Body
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-06T21:29:52.991Z[GMT]")
public class Body {
    @JsonProperty("name")
    private String name = null;

    @JsonProperty("status")
    private String status = null;

    public Body name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Updated name of the meal
     *
     * @return name
     **/
    @ApiModelProperty(value = "Updated name of the meal")

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Body status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Updated status of the meal
     *
     * @return status
     **/
    @ApiModelProperty(value = "Updated status of the meal")

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Body body = (Body) o;
        return Objects.equals(this.name, body.name) &&
                Objects.equals(this.status, body.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Body {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
