interfaces {
    ethernet eth0 {
        address "172.20.20.21/24"
        address "3fff:172:20:20::5/64"
        description "Management Interface"
    }
    loopback lo {
    }
}
pki {
    ca clab {
        certificate "MIIDizCCAnOgAwIBAgICB+MwDQYJKoZIhvcNAQELBQAwVzELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGzAZBgNVBAMTEnBhYzQtMjAyNS0yIGxhYiBDQTAeFw0yNjAyMTUxNjAyMzFaFw0yNzAyMTUxNjAyMzFaMFcxCzAJBgNVBAYTAlVTMQkwBwYDVQQHEwAxFTATBgNVBAoTDGNvbnRhaW5lcmxhYjEJMAcGA1UECxMAMRswGQYDVQQDExJwYWM0LTIwMjUtMiBsYWIgQ0EwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQDNb7QnPAdc+FG2kRshuMyEehmIuk2zY0vSbwv3Wd1M57DYm0VZn6VxGue5/MXkKzXqptQ4OmTj90JMzgMcMDC7ECvNwkCHsOqMtJszYqPnG21wmTvaVPdw5ZnO1F24keoKy8JARccoQ8piCX3gOJgCBJx5UDu1zRkLSTviFB1JFw3PdewWRqX5r/QIRY453uEQJfwh5pckIR3AnALz17Vd3EJ6Tzw1Zwa15wMBhAnMIu388MfTxS9WI6psvxHegUDv0Lo2cf95IGcOJcoSz4rFzOoVG8Qqm4ot/Df59vQ0wgdYqkY2Qn5XnvGzIYfZaeWtmnXdzPLmks5CrU5tun2RAgMBAAGjYTBfMA4GA1UdDwEB/wQEAwIChDAdBgNVHSUEFjAUBggrBgEFBQcDAgYIKwYBBQUHAwEwDwYDVR0TAQH/BAUwAwEB/zAdBgNVHQ4EFgQUuAHQ5MVNSKg3akumYIXfq7uk4dQwDQYJKoZIhvcNAQELBQADggEBACBBukDr0DGkAB5uUt8kXwpk4O++br5PMrKU3gefK4bVBbLzUck0KSZ3r6SsV09FTSDFTHDgxllLpps5/a0OjbmU+UtMbZOd2WAyywOTz/W9zZlxR/PaoDHTFDfSPDAM1+X+lovpbwnKNIG62clMLWcDEIJ0eJ8FfIRkmyx6vZBt09hIjvbQpiejETnQLWuDjCymt7pStQRI7WrLfg9bgA5/6ucWCVq6a6nHXEwDh917c8RBV43lsiYXuhu1+/fh5UXUjpTVJXdTo0iqdl9hgOspvxTy2B3MOMKuMCJdw77D0ZX+29e6xI4LqIU0CBUErnWQfL50/3dyZQK5XcVToe0="
    }
    certificate self {
        certificate "MIID0jCCArqgAwIBAgICBnowDQYJKoZIhvcNAQELBQAwVzELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGzAZBgNVBAMTEnBhYzQtMjAyNS0yIGxhYiBDQTAeFw0yNjAyMTUxNjAyMzJaFw0yNzAyMTUxNjAyMzJaMFgxCzAJBgNVBAYTAlVTMQkwBwYDVQQHEwAxFTATBgNVBAoTDGNvbnRhaW5lcmxhYjEJMAcGA1UECxMAMRwwGgYDVQQDExNQRTAxLnBhYzQtMjAyNS0yLmlvMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA1pXMF8snfDhuqgGVc7rZXACv9Qqb0lQCPEX7jKiKV+fxQdpq3mtU05pzF5+WaEe1MNaIl9sA8KIltaR9173GXv0ydcRqhPOjbaxTYtqLlV/AWaWBomocMwU5WCw7XU8nMskOWTfjo4vDFfXbrVV2mYJ97YyrLczjMHZeR6wJLR+39IlRpQ5hXkobjI5OPVtxzXphWBe/RH31KxxVvekPzQ7Db0wSRQ/CnZ0f2pjAAzyB6uILej1JTbjWCpRxQryshtZ2DNZqpRtCcFrHh4SNLfqJU6VTXYAwcS1Uh+CGLFFZp4TT7lTA6lo85m8XPovG+wtxKJn0lpaEQ4nauhZAFQIDAQABo4GmMIGjMA4GA1UdDwEB/wQEAwIFoDAdBgNVHSUEFjAUBggrBgEFBQcDAgYIKwYBBQUHAwEwDgYDVR0OBAcEBQECAwQGMB8GA1UdIwQYMBaAFLgB0OTFTUioN2pLpmCF36u7pOHUMEEGA1UdEQQ6MDiCBFBFMDGCFWNsYWItcGFjNC0yMDI1LTItUEUwMYITUEUwMS5wYWM0LTIwMjUtMi5pb4cErBQUFTANBgkqhkiG9w0BAQsFAAOCAQEAs41pZnLBPS8bdzt98bv1RV24uRucjUmX6QOFR/ZKjvDA/jmz8323BWyW0qvY87Dgj+ybQG5b7WqDDtUyrQnaGzWUt+Ub/hlgPuS2njyAlzVPlLLauQYGyMXCib4EVlaJhIYhvWBZ6Xqo2QtuZy/p34nEqaTeSikjYVs3h+y4jcwUsaZl1mou1R/YLCe22HDXG2Gac53RfEFvzD1babyZgPishzLztDUR2x5Wp9fzUL65M3tTabuzXMco+Zft4X+nP6sWnO1ZeAuj32fTALUAla7QUAI9221cEfoIIQQL2Sog6DxMSnYdVYMXyXNm/7xQWbwdU11OWYHaPOdUWKR2yA=="
        private {
            key "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDWlcwXyyd8OG6qAZVzutlcAK/1CpvSVAI8RfuMqIpX5/FB2mrea1TTmnMXn5ZoR7Uw1oiX2wDwoiW1pH3XvcZe/TJ1xGqE86NtrFNi2ouVX8BZpYGiahwzBTlYLDtdTycyyQ5ZN+Oji8MV9dutVXaZgn3tjKstzOMwdl5HrAktH7f0iVGlDmFeShuMjk49W3HNemFYF79EffUrHFW96Q/NDsNvTBJFD8KdnR/amMADPIHq4gt6PUlNuNYKlHFCvKyG1nYM1mqlG0JwWseHhI0t+olTpVNdgDBxLVSH4IYsUVmnhNPuVMDqWjzmbxc+i8b7C3EomfSWloRDidq6FkAVAgMBAAECggEAHwhZVGyRGIYZvPTPLgYs1oET8UpYOA3lp91QEGq0XRuiOI2TjHh1s0dgEx/Fcu3B3p778Igfxe0RKohwGZHsnQKdeEoQRItujFcSVRa5fn/zM5O7oGcbjmZYQW/eIvOmPdI1RMJQJa/55dRhMVtNdExalU7VV6GMjo7juhY/Wnq6vw37w9f8sHN2ggTFA8eYLZmr2UbyDwnawZyzSgbsn7141c2YemIhejGabo5/fOnJSthBrGTCG3jtY08+3Lav81vMPmWh4DmWswKQ/CEN4L8uFdSMl0Miab8yAWdPuqHzGZz8EPSP3PVFV9i95X6q3n2v1WwfbmUT/xNuMPuiWQKBgQDjO52XOyHuYGx8eI3Q1yajraiOxNAtp2yn3flKmUDqUU5QP3BBdyRAzVp3VEz3l7+d5/6qCLafhqGtgiqbfHFWJUuIRe1X0dSXIsg6Pa+Z0FuYojdCxwvYH2NLcgAJa8n8fOhndTFYoHIiaFobNiXEflbpjOaaukCz5n+pFrLxHQKBgQDxwEghMaIn0p/UNWLlOg3wIdYCtatueSAi5vveBcVqRK5l517pMFSKq8YKltCetgsVI9wwRfdrRo83tNlbeLfqbNAbZkGZqo0+Q+OEM2e7pDK01lYaC+kudoVOj5XCQjjkSsx1EG9VGNvFkWKxu9JVMHyHJWUsNlWZzDzg/luRWQKBgQCMDzPcglMwxfg4ZGotHmAvpRtvHHqgmUDM23IL/BhaFVFq/x8nCtOqqaioQqrKNZujLdr3XTWLcIV5F/FBM1v8WDKNRWS8q5YYrhSyaVEyQo4ir2HWZC+1v+sJFrRVGj4+xZLOKhsHYKXY9W8MtLxkt+bEP9fn6QN2n41yYI5dNQKBgEKF+NM5hzeSG+0XK7mMOh2kEfH4782cgx1XlmNID0To1VyxSEq+w+TM09hCG/Iwgeg1T/fwqN7aMbrQhydGlsVpX/LKNq8EYY2KvOa6Bod57YIZoOPV9zqT3qb5l+o2stUPSCfGd/xgtMku8ouZ9Yz/pKTDw41g/jkuHGqFU8kxAoGBALnruL76Xd81sO3g8pIbGOA6u9g08sQ0zAxBxuevhRaNr99ZtlD4wf4UuXi0szApuR7tvPntivyTB4C28FQxGqCe02ymvxf5lHGQoQa4X69qobeYXtr2Q9wRo4uEugW6N3fpKmW1XOj6o+aKJWA0G8MOEqAhGy1enuxuDpxhTKtc"
        }
    }
}
service {
    https {
        api {
            keys {
                id admin {
                    key "admin"
                }
            }
            rest {
            }
        }
        certificates {
            ca-certificate "clab"
            certificate "self"
        }
        listen-address "0.0.0.0"
    }
    ntp {
        allow-client {
            address "127.0.0.0/8"
            address "169.254.0.0/16"
            address "10.0.0.0/8"
            address "172.16.0.0/12"
            address "192.168.0.0/16"
            address "::1/128"
            address "fe80::/10"
            address "fc00::/7"
        }
        server time1.vyos.net {
        }
        server time2.vyos.net {
        }
        server time3.vyos.net {
        }
    }
    ssh {
        listen-address "0.0.0.0"
    }
}
system {
    config-management {
        commit-revisions "100"
    }
    host-name "PE01"
    login {
        user admin {
            authentication {
                encrypted-password "$6$rounds=656000$Da6yZi1un36Sq2zV$K.ZV9iIY3NfB8Awh5NhLDC0YaTz43tGTY0iCaiYvKdXR6ApvW0wWLiS1LAYtaYnsfIP4XN8BhO9m5ETX5Ib99."
                public-keys clab {
                    key "AAAAB3NzaC1yc2EAAAADAQABAAABgQCrNNRvXqLqgzLt/RnlXU5HGKIjhQWlW5hr0OCJz8zMR9TeraWe+pOehLlzhJQ4Nd9SF/7mekT2jQitbv47Nrb9p2FRAnoxRVWuGXc+tPsa8tlZnV9cVZ7EBaxRU27xBmU0bfLI8u08/atsCsri30nPoZj0MvGMLHDnp++FA+3NM/3WNOdv+eJ06H0KNmW8swq/tzkWbX+OmxCG3FDs9l0Q1mcMVePHwCy1AwClkcd3bOpIcvQ6h49wBlTwoKK8tmcbuT62wkN2AWEcYwTHgul1P0JTtUbYylX+q5lBqMcZm0YWJMY2idyGHLyOCPNaV+YdiegvnIqyKLfiUEQ3nyUQK9KpiNQs2xFZ5TUg26wzZpvAyzRpLYlycw3L6Rc82fKxO60ZgZsmvtzYEga8Cp+KMMdOhbzBxn5rRy1pTp7CgVFLldEL9i2HBzaJEqwbsC5DdjzxoU0wYUq/jvBfGY8wutQHp2txCaMGUOA/GEYPUuzKQRFj5JgKwYkMxZ0oock="
                    type "ssh-rsa"
                }
            }
        }
    }
    syslog {
        local {
            facility all {
                level "info"
            }
            facility local7 {
                level "debug"
            }
        }
    }
}


// Warning: Do not remove the following line.
// vyos-config-version: "bgp@6:broadcast-relay@1:cluster@2:config-management@1:conntrack@6:conntrack-sync@2:container@3:dhcp-relay@2:dhcp-server@11:dhcpv6-server@6:dns-dynamic@4:dns-forwarding@4:firewall@20:flow-accounting@3:https@7:ids@2:interfaces@34:ipoe-server@4:ipsec@14:isis@3:l2tp@9:lldp@3:mdns@1:monitoring@2:nat@8:nat66@3:nhrp@1:ntp@3:openconnect@3:openvpn@4:ospf@2:pim@1:policy@9:pppoe-server@11:pptp@5:qos@3:quagga@12:reverse-proxy@3:rip@1:rpki@2:salt@1:snmp@3:ssh@2:sstp@6:system@30:vpp@3:vrf@3:vrrp@4:vyos-accel-ppp@2:wanloadbalance@4:webproxy@2"
// Release version: 2025.12.11-0021-rolling
