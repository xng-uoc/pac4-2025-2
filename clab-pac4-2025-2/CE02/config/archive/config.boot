interfaces {
    ethernet eth0 {
        address "172.20.20.32/24"
        address "3fff:172:20:20::c/64"
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
        certificate "MIID0jCCArqgAwIBAgICBnowDQYJKoZIhvcNAQELBQAwVzELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGzAZBgNVBAMTEnBhYzQtMjAyNS0yIGxhYiBDQTAeFw0yNjAyMTUxNjAyMzFaFw0yNzAyMTUxNjAyMzFaMFgxCzAJBgNVBAYTAlVTMQkwBwYDVQQHEwAxFTATBgNVBAoTDGNvbnRhaW5lcmxhYjEJMAcGA1UECxMAMRwwGgYDVQQDExNDRTAyLnBhYzQtMjAyNS0yLmlvMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0wxabEzCHvAifXVKQm5TUogTbyDx25Spy19kY2pSrScwA11zz/7Htcbq/IUdNNGvfa9rQI0VWfkSuoKor50tn7yOJl4ecvog48XrCziq8OH2MAuA1t543Oa8Q52GWbAKbGYWUORiplu/5xrqhLTYARDalhjMF7sMvEbLu/SvRbocxzsXk0RAzvboLVRbWautSH/GT9E3wW09/fi8nTsUlreTgm/vJ5dxi4CHVGfMbLxsSc2959PbyFrNqsG3IxzP5qsqdmao2WRzf47hqNu0CouE4tOMk6NxqRZ/EXBOIneGeMV0bNPw/FEUZI+LV1io3tsNbnhSGOgcBuv+z39gCQIDAQABo4GmMIGjMA4GA1UdDwEB/wQEAwIFoDAdBgNVHSUEFjAUBggrBgEFBQcDAgYIKwYBBQUHAwEwDgYDVR0OBAcEBQECAwQGMB8GA1UdIwQYMBaAFLgB0OTFTUioN2pLpmCF36u7pOHUMEEGA1UdEQQ6MDiCBENFMDKCFWNsYWItcGFjNC0yMDI1LTItQ0UwMoITQ0UwMi5wYWM0LTIwMjUtMi5pb4cErBQUIDANBgkqhkiG9w0BAQsFAAOCAQEAAOYlVC/WbWznLnTPuwqXuf8RFsx+oTvIzi4AxArYytx6q1P8/47nnqptckwIw0Ubxf9VvN9wvbJKZeXnoysRPCbRzX9Em76kmFq/R0bF2a8yUbFhHRkD0LH+4QLAjFy1cLLbB+dv1YbFRrKWJ/nNhpnR/MUHY1HywJpryApgT1G+on7W9etUf0jJlk1yVOvMeL4EiCe7sZM2RZ9QyANItMWD2s4KubFBt3hV9tThGscgF3Gyru0Ui7iwYaiSk5O9lkIFawyO9vDG3Ms9KwFsb5C6YCpo94VABGzY4rrCxIXmxG42Kqo29kzAjwHNC5vwUdOJcTYJDQmwsAf7fXnFwA=="
        private {
            key "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDTDFpsTMIe8CJ9dUpCblNSiBNvIPHblKnLX2RjalKtJzADXXPP/se1xur8hR000a99r2tAjRVZ+RK6gqivnS2fvI4mXh5y+iDjxesLOKrw4fYwC4DW3njc5rxDnYZZsApsZhZQ5GKmW7/nGuqEtNgBENqWGMwXuwy8Rsu79K9FuhzHOxeTREDO9ugtVFtZq61If8ZP0TfBbT39+LydOxSWt5OCb+8nl3GLgIdUZ8xsvGxJzb3n09vIWs2qwbcjHM/mqyp2ZqjZZHN/juGo27QKi4Ti04yTo3GpFn8RcE4id4Z4xXRs0/D8URRkj4tXWKje2w1ueFIY6BwG6/7Pf2AJAgMBAAECggEAC9rNiHhOTiEUeuIX+//I9+GTX+Jkm34wBG+1Cp2KC9Zf7Mx2ySfpTWVhRTJv98vQdPmhx2Q1XxKt0eKteYHVcnvLq02Nnc09hDXVlFGITpQOuVeoEsm31cazLAQg7BBGoZyhY8VUYj5UmvVo12/2EydAc/5sFmgoGLpMTuA5aSvnMNXTQoKsiDf6JxbG6hvIaIsI/yWvTqKNqb7BRla9seQ2KSy5fj4Oov/ke64D1JHiRBYlVbrBVm5O51JoHqeaIJVB1IyXtYuXf6YyAciQEhFKKlE/XrQWdy88wAv8NgoalzjX+zR4s1Pxsx7955dj9pMIuLH2+HyjcD8JyHuMhQKBgQDakClcx//HUXt1UYP9kkCF14djARKvigiSXtg8w/C9jvochL9AImeoC+RjxNfxzPTuccg7nDGtxcsiCrXrtwZ66qYtZDcAmNvRKspmC579rYOXiDIlPQDie1hc0t9+EMs59wd8DZY4NOeHW5sc2K+ysWLv8BFq1pSqoxu4CejqlQKBgQD3MqttZ9hRKduZT4BS3nDEtE7O10tAsCCNEnMzS1rajxeI8MxVCSWkdrBtyppWMZNhrnn/IZtTQQRNnP/a2y6Qo2WSCugz4cwRqvfc/cX/Y/FTzHnkGXVus4JeB8kJXp3F4unjk2IZP0HXOzhWUsI8eB9OsiU1tJNApjXFNuH2pQKBgGtfTzKpflqpCQHFnhZAdzpJe9WDfW6HXVarCYgwqmA1kWHZRSt4u3uu+/CXj47Wpa1OcJP4U9+OwBBlOqImNCTGigTaqrq8XaEQaIZhRyZQy8jxu9DXe0vIVMylO+5uyagcV6z178qFEwlIU5eETCx5QKWnRqc566c4ojFzjN1RAoGBAJjE0bjdcoxGaBaJUW7lVZ/bJtEhsLobnyJQAq3ypgVoZU0WM9Fhw8euKj7P9S3LmZ/GqlKIPGvpRHWKz3w79L0ingTxhKt7ohhRJrmGhDTfWSdGuRXEvhRaD/l4qj+GH89J+u3QCdI8i74uNRT0NGIWgpKp+eEE5fQQRC7LSj6ZAoGBAIeLiTIbFN786R3aOA9vvFw6GZlIBMK7brp9RqUjESfeb9fgMq2zgQbqmh2PdfFDs76+wovB90Cjl+PKGn7Fko3dgzU+Nmxc6yjjiN2/GNG6cHFeNcYVX9BUTzA4DwvngOT107qn4nnE58hXqLZ9fFYKnvQANN5lG2vqXUq/NLlE"
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
    host-name "CE02"
    login {
        user admin {
            authentication {
                encrypted-password "$6$rounds=656000$KgRaxwFZWG0TyarU$iuDbJUlvwRVgq7XReCKPymvkyaGbtROEnfX9PuCTR8Z7NR7kGpEopJlhkmddHfKdlYecFOkUTlgd3TOdEwRFd1"
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
