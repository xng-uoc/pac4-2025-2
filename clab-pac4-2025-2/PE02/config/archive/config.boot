interfaces {
    ethernet eth0 {
        address "172.20.20.22/24"
        address "3fff:172:20:20::7/64"
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
        certificate "MIID0jCCArqgAwIBAgICBnowDQYJKoZIhvcNAQELBQAwVzELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGzAZBgNVBAMTEnBhYzQtMjAyNS0yIGxhYiBDQTAeFw0yNjAyMTUxNjAyMzFaFw0yNzAyMTUxNjAyMzFaMFgxCzAJBgNVBAYTAlVTMQkwBwYDVQQHEwAxFTATBgNVBAoTDGNvbnRhaW5lcmxhYjEJMAcGA1UECxMAMRwwGgYDVQQDExNQRTAyLnBhYzQtMjAyNS0yLmlvMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqrrQdXNETCLlvwfzJa7Onfal9bnf1kotzWgfHXvI/LxMNRQWvwvykWQnOPrFNPq/NyaR4kBeZGvAceaE0AiN92G6eWqOlV4bh/ouDtUljQoKt3d3yLiwA/8S3ZnT4wj6MQhKeAkKlOnKwJ3g4QxgLtlLXBIm7wJCmIt8OfSmX45+rZEwWp0uhZDDvE9fDN/5TifpnwSrr7qtsNS7NmdVsMcHYH5VpGtu6Arw7ybPIoo5EiGkb7WLIfkunra4lYMZv0AZW4HFviLdsGZ/Dp9nTGfLrnffFDT/RGi3JdlVcPAOBThyX6fikT4yghczkOuxKXZiBA5rx7rT/fJ4SnlZfwIDAQABo4GmMIGjMA4GA1UdDwEB/wQEAwIFoDAdBgNVHSUEFjAUBggrBgEFBQcDAgYIKwYBBQUHAwEwDgYDVR0OBAcEBQECAwQGMB8GA1UdIwQYMBaAFLgB0OTFTUioN2pLpmCF36u7pOHUMEEGA1UdEQQ6MDiCBFBFMDKCFWNsYWItcGFjNC0yMDI1LTItUEUwMoITUEUwMi5wYWM0LTIwMjUtMi5pb4cErBQUFjANBgkqhkiG9w0BAQsFAAOCAQEAivILBl78fHnVgG1iCSfvIKrqYhSghhuXW7k6BcJuBt0oNfvO3jRPiF48jUQSJPUpe5EVzw9AS7X/oeyPgpXEE+7Zkc+kJNF97TNS3B46JWsmAq3kF4OjGcDymV/A77nwXZwJh9pK9CjkASvE8cA+y4FyqX0MuLSPg9PX7oV7i2bKfTxREp99h4V+5e6ANXcOwVK4GjLDE53sfnDDT7U4dq4E+DQSn8fRCzTD3QorR1B3IeUQRNzeK1tHM3eApW1serhrf+aPT0tHRY5jsaY1ypCSYbFSa4iYRauiC4figwd5f3h2issEMB5Pd3beTYGNE0KQIyg5pkjR8hBm+OAAfg=="
        private {
            key "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCqutB1c0RMIuW/B/Mlrs6d9qX1ud/WSi3NaB8de8j8vEw1FBa/C/KRZCc4+sU0+r83JpHiQF5ka8Bx5oTQCI33Ybp5ao6VXhuH+i4O1SWNCgq3d3fIuLAD/xLdmdPjCPoxCEp4CQqU6crAneDhDGAu2UtcEibvAkKYi3w59KZfjn6tkTBanS6FkMO8T18M3/lOJ+mfBKuvuq2w1Ls2Z1WwxwdgflWka27oCvDvJs8iijkSIaRvtYsh+S6etriVgxm/QBlbgcW+It2wZn8On2dMZ8uud98UNP9EaLcl2VVw8A4FOHJfp+KRPjKCFzOQ67EpdmIEDmvHutP98nhKeVl/AgMBAAECggEASJLp+ws5DI5HEDneY3XX8bD/oiFVo59bsfWhSGSurrSSRnvYIXUAM0qaG7AJtXgjYVu9ZqpLFa/yGdjOOypvwqlh3avsmVTsKhSwkHCNqlMK9CtOGV5cwA4lJFr4BYny5HXsRfM98sgg/lj+V1vt5OxMiwJSV4Yj7flZIL+9G1/i9PjwYFtUTf8n9fHlHSvzt/RhDkraHvJz8Vs0tahLWSUoMvtBIYGNL4ETX4YQhgzaUfE92wiTS1Y6dDY0l9cmwh2YlgS9SLI1Iw0pbiMhB73qnNF4JsP/OGbQUAWcE0jsSxwcpB5IJMCkXnWs6QlKWiCU4pJ6DyV+L+CK1wC9fQKBgQDMpK4CfA9B6A8v72Ha5DUa7d01sfkV6RjAk1FqPzPctynUxM1Wvgcxb8s9hnhIKCf8ne47BlQVaDZFSypzsQPS8RVogZ2/WjOrUZsnbk9EhazHD2Z+GQkdKTc+Mrg7NA6G1BTPeFCqzufappntQpD3CCy1ePEych6LsoZCstY8XQKBgQDVk1t2vzeNd172L0zv9mRn+RFK6LtSa5M6nW5h6Eg+snTpynl6QAW0FtgwaiJczFLSgf98IwvlM6g8oLyOWfPXhm1hWn3vBvUHZhVQ+G27p7se10J6PrTv5nlUrlt6AnbyAOC9lSqHIaCty3QgvQA5BD7hjOqhjutGbi3ZSj+viwKBgQCvtapPKdQz45u+rcyYlJ9gWuI363MStAzztMoP7uqJ1Z8OOFiS5SDp+rJIRoBafFgxGC1n8rwZkVwfzTVLFq9Q3H1kOP6IQVvh+nS8u4NGM3yxgnCfTsG7jxsGxafX9Y+PhuPDa+vfbT44SBocVK6B3Tv+KTT3+nJtwkBzXniCZQKBgQDSk9TlkwmKAP1vTBnWqyA6Z5fGPQuc6xYh/+E6xZSdxMSDUrBNedxlwPRtX+f7iTXL+oLVeZSb6z/gbzcaP9StVwx3pYpvZ3OmVN+FkzxWfr1/XgxcjYFG2/4bIUJuXQm7+GOeaPmifOR5FxWrxc33aZk6N/+LRWfybGXmTU/XmwKBgCYHAPSSMPTpjEwl0bdOVrFmv4Lt3oFLk20/FA2qs8IT/m8BrUuIaU6eqaZbfGktgpHLtzPoKTtCUt/baLCliCB0Utxs5WuU9r6cN2XAO4ysoTB7u9y28JEotBWt8EGQHYNkFSbdGyaPuvh0ZvCsF+OixIQ8QCGgf/L91XLmYRHo"
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
    host-name "PE02"
    login {
        user admin {
            authentication {
                encrypted-password "$6$rounds=656000$4I2umWubxwMNILcz$RFDtg9/NPnGV.pMY5fUBf3Ly/HHU0CIWucXq/QlVuvgj./.Ycj1mDx/2NhPE./Uh5C..qk/lZUvqqaumMaHTu0"
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
