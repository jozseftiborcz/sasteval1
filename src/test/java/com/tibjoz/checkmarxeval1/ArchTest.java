package com.tibjoz.checkmarxeval1;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {
        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("com.tibjoz.checkmarxeval1");

        noClasses()
            .that()
            .resideInAnyPackage("com.tibjoz.checkmarxeval1.service..")
            .or()
            .resideInAnyPackage("com.tibjoz.checkmarxeval1.repository..")
            .should()
            .dependOnClassesThat()
            .resideInAnyPackage("..com.tibjoz.checkmarxeval1.web..")
            .because("Services and repositories should not depend on web layer")
            .check(importedClasses);
    }
}
