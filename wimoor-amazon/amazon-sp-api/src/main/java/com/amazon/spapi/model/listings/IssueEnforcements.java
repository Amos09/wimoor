/*
 * Selling Partner API for Listings Items
 * The Selling Partner API for Listings Items (Listings Items API) provides programmatic access to selling partner listings on Amazon. Use this API in collaboration with the Selling Partner API for Product Type Definitions, which you use to retrieve the information about Amazon product types needed to use the Listings Items API.  For more information, see the [Listings Items API Use Case Guide](https://developer-docs.amazon.com/sp-api/docs/listings-items-api-v2021-08-01-use-case-guide).
 *
 * OpenAPI spec version: 2021-08-01
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.listings;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * This field provides information about the enforcement actions taken by Amazon that affect the publishing or status of
 * a listing. It also includes details about any associated exemptions.
 */
@ApiModel(description = "This field provides information about the enforcement actions taken by Amazon that affect the publishing or status of a listing. It also includes details about any associated exemptions.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:09:40.926+08:00")
public class IssueEnforcements {

    @SerializedName("actions")
    private List<IssueEnforcementAction> actions = new ArrayList<IssueEnforcementAction>();

    @SerializedName("exemption")
    private IssueExemption exemption = null;

    public IssueEnforcements actions(List<IssueEnforcementAction> actions) {
        this.actions = actions;
        return this;
    }

    public IssueEnforcements addActionsItem(IssueEnforcementAction actionsItem) {
        this.actions.add(actionsItem);
        return this;
    }

    /**
     * List of enforcement actions taken by Amazon that affect the publishing or status of a listing.
     *
     * @return actions
     **/
    @ApiModelProperty(required = true, value = "List of enforcement actions taken by Amazon that affect the publishing or status of a listing.")
    public List<IssueEnforcementAction> getActions() {
        return actions;
    }

    public void setActions(List<IssueEnforcementAction> actions) {
        this.actions = actions;
    }

    public IssueEnforcements exemption(IssueExemption exemption) {
        this.exemption = exemption;
        return this;
    }

    /**
     * The \&quot;exemption\&quot; field serves to convey the status of enforcement actions by Amazon.
     *
     * @return exemption
     **/
    @ApiModelProperty(required = true, value = "The \"exemption\" field serves to convey the status of enforcement actions by Amazon.")
    public IssueExemption getExemption() {
        return exemption;
    }

    public void setExemption(IssueExemption exemption) {
        this.exemption = exemption;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssueEnforcements issueEnforcements = (IssueEnforcements) o;
        return Objects.equals(this.actions, issueEnforcements.actions) &&
                Objects.equals(this.exemption, issueEnforcements.exemption);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actions, exemption);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueEnforcements {\n");

        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    exemption: ").append(toIndentedString(exemption)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

