/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pharmacare.pharma.order.manager.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author hrojas
 */
@Getter
@Setter
public class PharmacyOrder {

    private String nameMedicine;
    private Integer typeMedicine;
    private String medicineTypeName;
    private String requiredQuantity;
    private String distributor;
    private boolean isPrincipalPharmacy;
    private boolean isSecondaryPharmacy;
    private boolean isValid;
    private String validationMessages;
    
    private boolean validNameMedicine;
    private boolean validTypeMedicine;
    private boolean validRequiredQuantity;
    private boolean validDistributor;
    private boolean validSubsidiary;

    public PharmacyOrder() {
        this.isValid = false;
        this.validationMessages = "";
    }

    public boolean validate() {
        boolean isFormValid = true;
        validationMessages = "";

        if (StringUtils.isBlank(nameMedicine) || !StringUtils.isAlphanumericSpace(nameMedicine)) {
            validNameMedicine = false;
            isFormValid = false;
            validationMessages += "- El nombre del medicamento es inválido. Debe ser alfanumérico.\n";            
        } else {
            validNameMedicine = true;
        }

        if (typeMedicine == null || typeMedicine == 0) {
            validTypeMedicine = false;
            validationMessages += "- Debe seleccionar un tipo de medicamento.\n";
            isFormValid = false;
        } else {
            validTypeMedicine = true;
        }


        try {
            int quantity = Integer.parseInt(requiredQuantity);
            if (quantity <= 0) {
                validRequiredQuantity = false;
                isFormValid = false;
                validationMessages += "- La cantidad del medicamento debe ser un número entero positivo.\n";
            }else {
                validRequiredQuantity = true;
            }
        } catch (NumberFormatException e) {
            validRequiredQuantity = false;
            isFormValid = false;
            validationMessages += "- La cantidad del medicamento debe ser un número entero válido.\n";
        }

        if (distributor == null || distributor.isEmpty()) {
            validDistributor = false;
            isFormValid = false;
            validationMessages += "- Debe seleccionar un distribuidor.\n";
        }else {
            validDistributor = true;
        }

        if (!isPrincipalPharmacy && !isSecondaryPharmacy) {
            validSubsidiary = false;
            isFormValid = false;
            validationMessages += "- Debe seleccionar al menos una farmacia (principal o secundaria).\n";
        }else {
            validSubsidiary = true;
        }
        
        isValid = isFormValid;
        return isValid;
    }
    
    public String getAddressInfo() {
        StringBuilder address = new StringBuilder("Para la farmacia situada en ");
        if (isPrincipalPharmacy) {
            address.append("Calle de la Rosa n.28");
        }
        if (isPrincipalPharmacy && isSecondaryPharmacy) {
            address.append(" y para la situada en ");
        }
        if (isSecondaryPharmacy) {
            address.append("Calle Alcazabilla n.3");
        }

        return address.toString();
    }
    
    

}
