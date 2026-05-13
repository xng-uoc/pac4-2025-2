interfaces {
    ethernet eth0 {
        address "172.20.20.31/24"
        address "3fff:172:20:20::3/64"
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
        certificate "MIID0jCCArqgAwIBAgICBnowDQYJKoZIhvcNAQELBQAwVzELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGzAZBgNVBAMTEnBhYzQtMjAyNS0yIGxhYiBDQTAeFw0yNjAyMTUxNjAyMzFaFw0yNzAyMTUxNjAyMzFaMFgxCzAJBgNVBAYTAlVTMQkwBwYDVQQHEwAxFTATBgNVBAoTDGNvbnRhaW5lcmxhYjEJMAcGA1UECxMAMRwwGgYDVQQDExNDRTAxLnBhYzQtMjAyNS0yLmlvMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAu6y9CrAYqlPl35V+k4phZ79NdlfNk8j+w7YfTmLWcCcvd7vGYZRH0CF0PKdUHaTxYnsoISkM2/syK8foLAr6ZHKTqF1h2cDVzit8A2ojtdMQ+tXURocWAizAM/XA2s6Y6rUFfAf9XzmGTH3c3epBt5AUNNMjmjJXFHxG8ZcLtCIz/mU6Kz+12B+8/KTm+RhGRLooSWaRFFi62223vLZjpQd24WxbRs056vFBBAUk50xHLNfI61bCgqZp7S25y0+xmu1G1Zj7uDq2eQKVTf4AQMdFrwGusSyVx9LEQcsKXOifPTxBs+UycLf8kH8mVWMudGEpc2nBXMUogAQv5JTlvQIDAQABo4GmMIGjMA4GA1UdDwEB/wQEAwIFoDAdBgNVHSUEFjAUBggrBgEFBQcDAgYIKwYBBQUHAwEwDgYDVR0OBAcEBQECAwQGMB8GA1UdIwQYMBaAFLgB0OTFTUioN2pLpmCF36u7pOHUMEEGA1UdEQQ6MDiCBENFMDGCFWNsYWItcGFjNC0yMDI1LTItQ0UwMYITQ0UwMS5wYWM0LTIwMjUtMi5pb4cErBQUHzANBgkqhkiG9w0BAQsFAAOCAQEAh7SsUmc7lBdaBjRPpHlDGjJ/v9z6i1/6V1TdCkH+POMjBCL1UulhaNNexfkdiU9Igefjc3a7Nh7S246RwfyV24dxSxDqnwjz7rFgL99kiobu93qqitOGvqpp/ieUwJPepjzC8Eh7xRcbVqjDl/bp/hJF6n3drhS2SNvBCkvgOlZ9C8fVIST5304K7SWlHRbGAlsuwvKaL11c4EQ8b0a5jgW3myT0imyAY/lzRLtYIc+7s6CAAOXggSk6hFt0ZFg1gmoj33Y0daxfwOl+vGHD/DrTOsWEvndCY76FvA2RebtS+A2XgQilE17Bbc0TH+jWfyTZEUubtPDza5RYIIPP/A=="
        private {
            key "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQC7rL0KsBiqU+XflX6TimFnv012V82TyP7Dth9OYtZwJy93u8ZhlEfQIXQ8p1QdpPFieyghKQzb+zIrx+gsCvpkcpOoXWHZwNXOK3wDaiO10xD61dRGhxYCLMAz9cDazpjqtQV8B/1fOYZMfdzd6kG3kBQ00yOaMlcUfEbxlwu0IjP+ZTorP7XYH7z8pOb5GEZEuihJZpEUWLrbbbe8tmOlB3bhbFtGzTnq8UEEBSTnTEcs18jrVsKCpmntLbnLT7Ga7UbVmPu4OrZ5ApVN/gBAx0WvAa6xLJXH0sRBywpc6J89PEGz5TJwt/yQfyZVYy50YSlzacFcxSiABC/klOW9AgMBAAECggEACUUF7VI3VaphL0LuBpGOMBal19OMZuFFnBsRvsho+Q8mbA6NROKTDXepixlksTYlagzVNZYWeYMVvk3YbNx5854pJua934iDxvQk4vJKIz/ylcEcBAPGFYNqVuariOMtcGJSjAbFAAASXxLUZu2cI1ntdZJ8LrCP1oYw5tvkCxiTuxzzhmTxAaeSPFrFJwBnx69Fim9FSE2P9QCwkyaT2jrqFKNaZrwO0xutd3UgjjR9sfbRmLub4g/OwpFPOpVOgJ18xA/2BHaXrNFzEENn6TCcesYFhYI8lv5A2XJm2lEi4ajhFc3FyCWlVjGzLAIjAP0OPUeDzAerb6L0he4MbQKBgQDedrstLjzS+R+gbFnHtrPVTjaGaRpSQd+wGVOt5VtM3/+gfymoiB4SfSItKThUX/RJO+geOAKRq+vY8ydLmG+e/xfJRieW4dTHAMkXbTqI/cn1AHR8/uYwcigVmNNlaLcT20IDgFvsANPP6/mkTj5z8RGbRyqTlk1iOqGSQzkZowKBgQDX92/zkxQsnF1ctTnXY3wvKBjFF6wy1bpEXe2gMg4PMVE0SzZbles2/uQl4CGDoZixHPI7dmquc+Vx3ck7/OWF17PZVc+oV9Ai6/76TWPWbv+2wDohhV+dyJcpG7Neq0cKQIsRn0MUdhrxQxXPZYwXqnQTKxR3cJ+EhtZOKIy5HwKBgAOtHJy7hd/KpB4njDhDqacdusLv27J+Si8DzCE0iBS2IuhJEawqS6zsinMKmlaymzvWlJhjPo+fsq8MHZsfMsEC4CbAVQkmRDjhp3EOqgf3ga3dyw8Bu1YTnNv2gY/McjIOzoF2To6Q2O83rBFuBZQu6KaTP33e3vp/k4nyOHBXAoGBAIQzze423KSqW2SC85NsLPrY+sC7ywebWdi7/tiPi5e1QtZWLEJINaKGybZ9y0Y+x6+z3nyT8p40CAJ6F9OG7iHOdyPVqbaNerXF7WHfufvsGtEOPweCE5QM1Kuvb0/GXUhjVj5FVdTSr498138L1IQwLboGJxMueBeySsGxhONVAoGABUFRYPD3zGhNeM0z+jBZhqLuOqPAfZpYFd2WpwKCgyvvOrhPEWEaxxQ4W8cibwu6T0TD3lTUgYNAQ3eXxZpoRGt75aDUm/eYpexs6rWL9QNCFrV7qa4hAZcMwlyF8e+DnmZgdY4Vje++i8teJ3SbNRGN7T+Xu5xXj0sMR/agnno="
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
    host-name "CE01"
    login {
        user admin {
            authentication {
                encrypted-password "$6$rounds=656000$rnlbL1m2q.o1myuP$90W1M9.9BqYFsIth4fIymTf683n9/S2XW.8otPA4HESjuIOs5yecOxts0m6MK2kqRg3braf2mkopGTr2glQ000"
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
