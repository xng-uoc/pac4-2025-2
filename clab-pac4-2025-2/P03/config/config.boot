interfaces {
    ethernet eth0 {
        address "172.20.20.13/24"
        address "3fff:172:20:20::6/64"
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
        certificate "MIIDzjCCAragAwIBAgICBnowDQYJKoZIhvcNAQELBQAwVzELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGzAZBgNVBAMTEnBhYzQtMjAyNS0yIGxhYiBDQTAeFw0yNjAyMTUxNjAyMzFaFw0yNzAyMTUxNjAyMzFaMFcxCzAJBgNVBAYTAlVTMQkwBwYDVQQHEwAxFTATBgNVBAoTDGNvbnRhaW5lcmxhYjEJMAcGA1UECxMAMRswGQYDVQQDExJQMDMucGFjNC0yMDI1LTIuaW8wggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQDS5+1bgDvrc1HFP0AMGoSkkNco0wFSRlOSZKfkKvOh9j6KnDnIWudjIVJ7N9kwKl68gJkaCCINHhs/0RKxM7qpLoZOdkqHhPCEhtrPgCGAA50AwCsnpFEH9gvBTjpBibkDfczaT6jAWEi2sp1CdKJk2GSpelGr4YwR9HNDcdZNsNtnmJnK5Q/SyD5CuU2y96SLWgt/V7BKbu5HpCy22BrOfqRmQHi2TtA6xKwfOnS0jc5sdoeq0rCXf15l6y0Dk3CZ23WWakRED0Er3kGilWpdoFoM1BbKDPSWExElnigd17m6v3YA83RqDJKV0YYLuhes7fpJ554FcSnF/ufhg3uTAgMBAAGjgaMwgaAwDgYDVR0PAQH/BAQDAgWgMB0GA1UdJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcDATAOBgNVHQ4EBwQFAQIDBAYwHwYDVR0jBBgwFoAUuAHQ5MVNSKg3akumYIXfq7uk4dQwPgYDVR0RBDcwNYIDUDAzghRjbGFiLXBhYzQtMjAyNS0yLVAwM4ISUDAzLnBhYzQtMjAyNS0yLmlvhwSsFBQNMA0GCSqGSIb3DQEBCwUAA4IBAQAT8M8lu7Rf39sI9xPri+9ngg1imPLfAjUaSK7FyOSU8XKvSYpz7JvkoiR7MkFk0U3l6Co6i+VNv2yL5yEmBr8939vhXAyiSAyJ1UidYmwk5FpIUtrP6lhSziDBOurJr7GEGCmJIPpHPUI+fKIceAmo+XrbNl9Lc1LiKK2N/9UQdvaNswbcO90TsHsy1ALp0Ay4WmQROz75aOwRK4ieReysNxN3/6SQ5QbqanZX8kvz5wvTG6/97K8XEa7J6nx8xbDBxl4Projfn/8UwQcImKs52DphhoAqxj+0Z/t1fYIWa1fsi013D+Lde3Ih/AfpJId87Y7XlL0etuN7KpgTFTrj"
        private {
            key "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDS5+1bgDvrc1HFP0AMGoSkkNco0wFSRlOSZKfkKvOh9j6KnDnIWudjIVJ7N9kwKl68gJkaCCINHhs/0RKxM7qpLoZOdkqHhPCEhtrPgCGAA50AwCsnpFEH9gvBTjpBibkDfczaT6jAWEi2sp1CdKJk2GSpelGr4YwR9HNDcdZNsNtnmJnK5Q/SyD5CuU2y96SLWgt/V7BKbu5HpCy22BrOfqRmQHi2TtA6xKwfOnS0jc5sdoeq0rCXf15l6y0Dk3CZ23WWakRED0Er3kGilWpdoFoM1BbKDPSWExElnigd17m6v3YA83RqDJKV0YYLuhes7fpJ554FcSnF/ufhg3uTAgMBAAECggEAW9a2mxOaBAsxXk0OnLanb+nKZ3KKrsME/Uhre4XglXRfA4jH+KDtBVOrURCeuMSagEcXZCiKe1/SydVG6Hb4H1etEFmeVqji+zKl8Zl//PiV04/auuZoiqjvsXtZDtTkBcsv+xiZCTjoYPYiWJ/lXziDjPFAwzHyBpeF4aaehTFl2SS4nnjxvX1GglL+dQ4shF9pNvENrD4ELMBxZclmszw7/4kOAIUDygFhVA3ifp19NdqWdjxp5VDK369I3CkBenxLyf7GuQ6XL570pb9CRMdIMRLMsJ4cboC1sqEn4a2luWohtDz/SSOuUVVLzbw+MRrI28NAshHs7tGDDF0HsQKBgQDqgYYJT3pyc4n2V0sOA18/ZH/00LMFWavGCVxUW/DuVVWfFs5zsE2WDkc9307P2MnHTuKjf9wAYB4T9Gnr5v5uZgLqlEnMRHaT2o2xZYOoyPyvJ+GjHS500YijGVzONQ0m+Z8VE+yVCX5o4MSy5YnDVi2lyTGmz5v7/s+WMSBBtQKBgQDmPKaPzr0EC2DDdwQaVRPMDm9TUdBrmN9I8Vyw9GGLe6nhO6o7nyhs8AlJYtKhGrPvsMR0Z+/sZJE1oKcD5udhAd1CTw1/qSUZVqRT18Z+WvsjnbZjNe5eEa1AZNuxZmsYvwK/fVHn86UUFEjKlQKG2T7L5SlSdthmMiCJc2M1JwKBgQDb44/XcxsR7pzSzI+oGClbu9TvrjHvNmIHVAerYnrMQGAEyNHVUN+vcLwEnDu+UT0DEkkZnm6gO4B4nZokhXjV8/mQFHQOgbPed/Sc/t8xiSTG6NJ+rII/L6q7pLCM+tnWTgKJNSGFrl1F4l0OkoVXEJvE9J8GF23gINJttqrUcQKBgQCvpam0oJZXFY8W0B+TL0DRNln8CLimvZPrBCgg3+/jB88MhAZVQhEHOwD6uafTPJn1zLezzu+dOwQFE7EXKvtuaIuyYLj9ob8p2422YTGPiD18aH+SpLxbi8TPEaMBbg9aa67fA+6OtLRF40u9MX0h/28HAqdJwF1LagakliEjlQKBgBipSJ5MU+p8mcWIcC7nHl21xVgC4th0ljkdq0zA+f8rVNtpYkCcz12zv5sjJXyht665Um3g7wwGbpz+tCuEevz47L4Rx75h0XEqDPd3+TtAGsJtfrpZWoMZnrKNIG1mZCcYZeWZUKlcX3vol6LD+YYi3mJeBhMVqd6vrMPFMS6H"
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
    host-name "P03"
    login {
        user admin {
            authentication {
                encrypted-password "$6$rounds=656000$33TjUilKgihF1wCV$HczSVb9HzvKk8FUUcIjzmhrHy9GCEtvjia2BFzfGmtfkDpiYmlnrtBJAoZWCPmRW/IAYD7E0WFzqOf0X4PckR0"
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
