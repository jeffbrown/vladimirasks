package vladimirasks
import grails.test.mixin.integration.Integration
import grails.transaction.*
import spock.lang.*

@Integration
@Rollback
class SomeServiceIntegrationSpec extends Specification  {

    void "test something"() {
        expect:"fix me"
        true == true
    }
}