interfaces {
    ethernet eth0 {
        address "172.20.20.11/24"
        address "3fff:172:20:20::4/64"
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
        certificate "MIIDzjCCAragAwIBAgICBnowDQYJKoZIhvcNAQELBQAwVzELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGzAZBgNVBAMTEnBhYzQtMjAyNS0yIGxhYiBDQTAeFw0yNjAyMTUxNjAyNThaFw0yNzAyMTUxNjAyNThaMFcxCzAJBgNVBAYTAlVTMQkwBwYDVQQHEwAxFTATBgNVBAoTDGNvbnRhaW5lcmxhYjEJMAcGA1UECxMAMRswGQYDVQQDExJQMDEucGFjNC0yMDI1LTIuaW8wggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQDPFaxMsKk+yyTfxTJQvICmjtrCMoaqLLzsVyP/pnfcfILniXIqSMvfODTLL9HA/xDe/q2NX5aQaWwslh4vLknbPSliChyrq/u24Y0mmW2ud2+/fm236S4K0NVXyh+8eYeRmNIHqbl7TX6tGRSdI/DY8YAmxm2tMaRH/OIikmW70cJEGsxCKpYlnRHcnbHHwLHzh2YRx50E53CPh+4Iu1HSTANTSrB57t4WTxsrwxdvjEy2pWfdr1Xgp/U3v0olEpeFqOEbna+JnjolztcDltdpWQspUpGr/S2QhxCuf0Q0MPy9FksKeD+dSNc4xZTbLqLg5nGr3rM61xFO/yv/Z97ZAgMBAAGjgaMwgaAwDgYDVR0PAQH/BAQDAgWgMB0GA1UdJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcDATAOBgNVHQ4EBwQFAQIDBAYwHwYDVR0jBBgwFoAUuAHQ5MVNSKg3akumYIXfq7uk4dQwPgYDVR0RBDcwNYIDUDAxghRjbGFiLXBhYzQtMjAyNS0yLVAwMYISUDAxLnBhYzQtMjAyNS0yLmlvhwSsFBQLMA0GCSqGSIb3DQEBCwUAA4IBAQCANQsVSekxTS09e6M3TnH2f0Nojh/bClHqJsbjiPX35gmnEGBvctsCR0ZN8/WW93q/m8IIHZw5UvoLehLhamSQ7dHopzEH/JldVdUak5lTWWeXntXXPuWOh1p1P9+rJ2oS9W97w05DzHygwoxv0HLjKV7qnd1COLDDOhhIrYVhbDIJZtkSRBnDN/wm5055BMuB35FWCyuKek6Ioe1JYgVsMY4xNANBacH3b1n2TfVq7AtBEU3Cqz8o8DveUZP8Pt44yO8/ocCeKMUpIAM1geXpz0Bqd8cvwpVwboYGcwQYsnvDnSAglZJb0/ugX8FBsXNkWeZ5yWo8E6Uwsu9uQA5G"
        private {
            key "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDPFaxMsKk+yyTfxTJQvICmjtrCMoaqLLzsVyP/pnfcfILniXIqSMvfODTLL9HA/xDe/q2NX5aQaWwslh4vLknbPSliChyrq/u24Y0mmW2ud2+/fm236S4K0NVXyh+8eYeRmNIHqbl7TX6tGRSdI/DY8YAmxm2tMaRH/OIikmW70cJEGsxCKpYlnRHcnbHHwLHzh2YRx50E53CPh+4Iu1HSTANTSrB57t4WTxsrwxdvjEy2pWfdr1Xgp/U3v0olEpeFqOEbna+JnjolztcDltdpWQspUpGr/S2QhxCuf0Q0MPy9FksKeD+dSNc4xZTbLqLg5nGr3rM61xFO/yv/Z97ZAgMBAAECggEAEgDG2WX0WL6tZnzMyoMQxioeL4rX9TxtcjiDKysMOZFjigCDedSZUL8gq9ds61PhYhmO+f7o5oYbvuaQGjbyecpf6iOJ6YzKldQXAteM1wGQJ/w0SqxNcehE29x5FNgV5pz8CWmCdAtBK4hGKAEjY6DfLL/MciWiLBX6jNngWUsTiNKOxXSiNbzfk9j/bylPP1NH0kd/nQPBvLZElv+rZjEjWK0E32G7ElbtK7ckVcmoU9NDFjnURa1sFeGdBFBQelG/IkUIpa1uKQyS+LOSBvZDPSfjFVRWgcEsVbVfsUcWngrrXv/pRHXMO6uuiw6d613yvEBzo5Ep9PpvExX4mQKBgQDkDYuUGkZSJRYGzXV7H7meyuSqC59FtlTJivAz0MB7+UiWZ1rZKlYKBsmx+j8pAvNra//+yKtW7kntfEUchgddWescNYrf6VAwIgZcshvhssB3inOo6BYSZ4TUfr0NHdpu2Qt+91MrFaSmaZF9ACROZY5m6J6VhBP0iZHhzQMapQKBgQDodlBVNCmQ1273y8F2vqPS/WMr7KqxjV8DpYnxNBTgxbxi4z+jWf59NDVL9XMf4AFdPLxUafabMos+EF4Ia702UrtvTXRW86wzjinBL6UHQfwGSmpYTJbjK7gSIrJQT0ybRk6JODk4Xm+RDhyyTHEF60DDPpSSFkBhtoOvoULhJQKBgQDRSVz+3d4LJN3CAGwAQm0mvSx8oY3ZfCrziv5Fjx4Wp/9liBRnl+K98NzI6M9t47dgrgyQ1bfoX2aY+6KxOo8nrI2Hpdt9AbEFezQ7fXj4+AKJshXSvKsE2Nud53G3x93ePHHAY1mAAKzJy7go7yhiifDVoEVpEXz+vgGTJ4HhwQKBgQDXdhIvZxG/tm6cLrc6oKinv0RUSiBMQYR3lM+uSV+wlpZt8cPiXF+NHP7pUK9MNAwPp2PHug9g+hAljnYZyAKwfy5Lk7bpgSFzB6mb7dVATOCT1BWNki+oj7Uk2hP8bAPNR/UzKnGe1akDAdmHSWLY4Zw9W5vJa+ZwqwKTnxymIQKBgA0aw2r5SsJTfp4SIGehHeOVQt7mtzXP2yV15kR95PEVbOHTpHFECp5uOW52JRzspPz8xZ9T3w33cjK1hwKkJdDpTxta8fmbzAf6BNXoDgUBnY2vexPjytXweJyvfNuwJPjKywiJdgfKclUv/OUljBsXCi/uEXnqIteNAMsVoilT"
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
    host-name "P01"
    login {
        user admin {
            authentication {
                encrypted-password "$6$rounds=656000$NE2PTcaHd1YT3oTJ$Q/Aoa3IVwssCu8kuPOQQOAhHbmVNg3ylyKjo1NjtGZuYWxwMbIVUafUwQdj2xUjWXytm5zLUP5Ho0ODN7rfou1"
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
