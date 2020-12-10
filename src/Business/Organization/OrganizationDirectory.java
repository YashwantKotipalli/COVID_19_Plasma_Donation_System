/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.SystemCoordinator.getValue())){
            organization = new SystemCoordinatorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Pathologist.getValue())){
            organization = new PathologistOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
    public Organization createLegalOrganization(Organization.LegalType legalType){
        Organization organization = null;
        if (legalType.getValue().equals(Organization.LegalType.LegalOfficer.getValue())){
            organization = new LegalOfficerOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
     public Organization createPlasmaOrganization(Organization.PlasmaBankType plasmaType){
        Organization organization = null;
        if (plasmaType.getValue().equals(Organization.PlasmaBankType.PlasmaBank.getValue())){
            organization = new PlasmaBankOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
     
     public Organization createCovidCentreOrganization(Organization.CovidCentreType covidType){
        Organization organization = null;
        if (covidType.getValue().equals(Organization.CovidCentreType.CovidCentre.getValue())){
            organization = new CovidCentreOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
     
      public Organization createGovernmentOrganization(Organization.GovernmentType govtType){
        Organization organization = null;
        if (govtType.getValue().equals(Organization.GovernmentType.Government.getValue())){
            organization = new GovernmentOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
     
}