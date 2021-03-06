import com.jeeconf.groovydsl.Monitoring

String.metaClass.sendStatusPeriodically = { Map params ->
    long period = params.every
    Monitoring.sendStatusPeriodically(delegate, period)
}


String script = new File("../dsl/${this.class.name}.dsl").text
new GroovyShell().evaluate(script)