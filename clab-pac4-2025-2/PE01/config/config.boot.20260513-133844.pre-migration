interfaces {
    ethernet eth0 {
        address "172.20.20.21/24"
        address "3fff:172:20:20::6/64"
        description "Management Interface"
    }
    ethernet eth1 {
        description "Link to P01"
    }
    ethernet eth2 {
        description "Link to P03"
    }
    ethernet eth3 {
        address "172.16.100.2/24"
        description "CE01"
        vrf "customer-1"
    }
    loopback lo {
        address "2001:db8::11/128"
    }
}
pki {
    ca clab {
        certificate "MIIDhzCCAm+gAwIBAgICB+MwDQYJKoZIhvcNAQELBQAwVTELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGTAXBgNVBAMTEHRlc3Qtc3J2NiBsYWIgQ0EwHhcNMjUxMTI0MTMwODE5WhcNMjYxMTI0MTMwODE5WjBVMQswCQYDVQQGEwJVUzEJMAcGA1UEBxMAMRUwEwYDVQQKEwxjb250YWluZXJsYWIxCTAHBgNVBAsTADEZMBcGA1UEAxMQdGVzdC1zcnY2IGxhYiBDQTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBANAQffWys00YehPMQQCT0srIFdeoSnIyMFFbSPf6qQtrKpcfRv8D3n5+3ZHwlobTqJkakQGe4w2ffcSnZkLZJSrhUKnc8yM9/5OiYRKwJZCOf4hH4KXzQooyE7mxNshRAkm3BMe9FZE5hor765WxROzQhv4r3Gs+80bFUbD19qzbyeW5kiTYTfDI8WBORK18eQAGW+zOu9a1y6OjhNO5JcLvEAjNgQezYimynneS/l81UMEydKVg0jhT4My22FSr3SiDjUyFo6ows2t3UeqgHWPW51c+3/UZomuSKG09ylDciEi0AuHCQ7rqgn2ZC5kUZUWlEMn4AncwHXe+864MyVkCAwEAAaNhMF8wDgYDVR0PAQH/BAQDAgKEMB0GA1UdJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcDATAPBgNVHRMBAf8EBTADAQH/MB0GA1UdDgQWBBTH1kcCQkfatkihc5IyESfZPo7DCjANBgkqhkiG9w0BAQsFAAOCAQEAZa02+feTpzEPMoJdZs/zqqnYT4FvUgFef9OPSKX9l82JmKx/3vnuxoWaH1IjkoWmy9qMlkGlSyHIYZYBEvjkjbDTU623OP85F+3u8AURKOVP76q4nRgOyiSACUXORL6OaHsI5I23RVu2NU2zAUMWXPFZSJKz0HqFoN+JeuVhjq3Nw4wIcTl/+unsps3f6tNACZsrrsPYMF2NBB4J40YGaivlogKKTcz728kHGhehxbk8bS6kbo26ZnhRD2bTpTnVGJcXkcPSyKaCixZ7n2Z9GyrsS7hHwJwD2diNIrNS6A5YRdBHPuTKos0twzmkAhTjxQMMQqIOmHmzlZ5B1oHr+Q=="
    }
    certificate self {
        certificate "MIIDyjCCArKgAwIBAgICBnowDQYJKoZIhvcNAQELBQAwVTELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGTAXBgNVBAMTEHRlc3Qtc3J2NiBsYWIgQ0EwHhcNMjUxMTI0MTMwODIwWhcNMjYxMTI0MTMwODIwWjBWMQswCQYDVQQGEwJVUzEJMAcGA1UEBxMAMRUwEwYDVQQKEwxjb250YWluZXJsYWIxCTAHBgNVBAsTADEaMBgGA1UEAxMRUEUwMS50ZXN0LXNydjYuaW8wggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQCpvx+8jz0gww6FHZKGOdYaZYkFddoIIv7pXKLcM6r5JLM5tvw8pNYduOzMe763uUd4+GHjQ3trRiFzsbPjXVHDbxJ4JMUkFnE5lA30yXQlaD6FaIwm1/cNzq5J8lLx6gYLxWRUilHDRQFzCoZITBuSNjpQHXcbdL7XzphDlBdtG/wqOi/s8BzuoLVTliJI9GxNNhH/+vAYKQ1HV2WrdgmaHepBds4yqyvE7AprMjuXOaGgnxPm+JcuUM8N5DThEUiDr2iKBVVmn0ZDtFe+xd8h+Uh81TjMM7huFkU33zfV8RmyO9Zb5OMekHMUSbOYdyff4IoQp5ecRac2WPDVVZNzAgMBAAGjgaIwgZ8wDgYDVR0PAQH/BAQDAgWgMB0GA1UdJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcDATAOBgNVHQ4EBwQFAQIDBAYwHwYDVR0jBBgwFoAUx9ZHAkJH2rZIoXOSMhEn2T6OwwowPQYDVR0RBDYwNIIEUEUwMYITY2xhYi10ZXN0LXNydjYtUEUwMYIRUEUwMS50ZXN0LXNydjYuaW+HBKwUFBUwDQYJKoZIhvcNAQELBQADggEBALfvTFR/Vd4ACD6zWp5CYBNaZ1qvv04/AqRue7Xp6PFxNaobDUmZ01v/TdwUngj6EyHbeukmynbyaLvOjEr/MXN3PHMkAqCMdC6+ZXoyc+GGnY+LQoyqrC3GdPCmtJKudcRVGSI6chVTXE3+rw4OU9P4s9tCZUHcYZDC41RFpskNuTxdQO/unzq5MD1zMITYHdWoa8vZNkBYN/7XhT2qmu6LIYLQlGR8+FtwvJGzSRHDoTBRjtSOWSM0nUPY2/CLmvLAA49+68nwxOrzSUPRBeiHcuKEuKOSZzmre90YIOv8u20XeenTvivrSkF5X0xmiNQO7HH/JKY3r9ceVkfcwiU="
        private {
            key "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCpvx+8jz0gww6FHZKGOdYaZYkFddoIIv7pXKLcM6r5JLM5tvw8pNYduOzMe763uUd4+GHjQ3trRiFzsbPjXVHDbxJ4JMUkFnE5lA30yXQlaD6FaIwm1/cNzq5J8lLx6gYLxWRUilHDRQFzCoZITBuSNjpQHXcbdL7XzphDlBdtG/wqOi/s8BzuoLVTliJI9GxNNhH/+vAYKQ1HV2WrdgmaHepBds4yqyvE7AprMjuXOaGgnxPm+JcuUM8N5DThEUiDr2iKBVVmn0ZDtFe+xd8h+Uh81TjMM7huFkU33zfV8RmyO9Zb5OMekHMUSbOYdyff4IoQp5ecRac2WPDVVZNzAgMBAAECggEAHRmBtE6N+SbXP2TBcLdLh/zuD3yTox90ucbCuKM25T0waG2BMlhDyJaiKa/xEwf1Q7y48z/nUY2VQIMvRoQB91H8RZJwJW6ffHJwLg23Fo6XYUF5/VK6rKhI4q5jH8uxu6TcPU31FFepFvKv8Ibzlw4q0v8qIw/Rg6eMHNGvbmm9P3nprqP3UOpMqZiAg/Giiw0vXDUSLnhGK4D9MPaNvpC+gU5E1sJUi7Wx+bphYY0qOw0FKA3c5iCIRY4vRdJIkyAU4l4kQcW6yYgj3oAZ6cC9Ck080jpBm61o53bBVfSPdqyR35ilw/VBdwm3qbb+paNLeg458uzVHdxP8nNIaQKBgQDXODWWDsD0ZGMLMpytjsdZ2butbYki3dZITrFygbHV7QN3YvCVY6AW9L6Hxa33888lC5NEAInUW098L0rgyfURsnb/8gOn4wYuD/jG+KauPpAdrz5kz+mlui5BADTL5YfkH8DxLx9wvexKL+WDLgF2wSK7x3OzHxsH5ouyPqPipwKBgQDJ6SC3HMkCjv02eEN8JTK8E6WKQETEjo1zj+ui3dl3wgJ57oZyTAsHXltFjD0rax9MSzydZ6DkIzOr6jtueeuOn/zeYwdWVkbwQJu/SceXp/42+EifugyCWvju5IcP+04VnvdLQImgHiyXoAeGiW8B4b6rR10ijetMmxOidv5eVQKBgQCm4h0bKIGSgC0Ux8AaDHakQ2N2DVOjR6UbGHocMlk1ar2fW4b2L/Q5GLqNCUnm1JUxQpKEzm4RzmQKBZnoSHHRsTL5MC6Jhk6KdTQRBUoqHrUdb3/QKDAipAWtvX0zBd6jk8PGwSV+BKcut4keeRQFg6ltNjGPGXWaYLi+FDh8TQKBgQDFzDYabH6WnRF97O7fjWlYSj7fYvp7O9NipFkIoiDKaysV3A+lpM0hGNR9G1dJU5XDnejxonVBSSLzhXFXVuTmQeDs00J61+aCsihhipuW/CHUJAKxRwe+I/S9wu51P5FNKP/FnqG0VBsHJuR4beZrh4TMMgsRMMqTr0/a1ot2SQKBgHlsMimd0gVsscOPyv+wktBI1NczSgL4bdPJb9qsSVZbEq23V6XGxAchYGOZzYG0+RMyMK0hheveuX2qpjq9sTXTEaF5CWVTnqvHr0dZmjsb2dJq3cCc+U3GMaN/f4Wo5p6Jd5yCFqzBn5ruXBnBLG9aVJ01mBaSwnwq3tLfsJ2V"
        }
    }
}
policy {
    local-route6 {
        rule 100 {
            destination {
                address "2001:db8:12::/48"
            }
            set {
                table "main"
            }
            source {
                address "2001:db8::11/128"
            }
        }
    }
}
protocols {
    bgp {
        neighbor 2001:db8::12 {
            description "PE02"
            peer-group "SRv6"
        }
        parameters {
            router-id "11.11.11.11"
        }
        peer-group SRv6 {
            address-family {
                ipv4-vpn {
                    nexthop-self {
                    }
                }
                ipv6-vpn {
                    nexthop-self {
                    }
                }
            }
            capability {
                extended-nexthop
            }
            remote-as "internal"
            update-source "lo"
        }
        srv6 {
            locator "L3VPN"
        }
        system-as "65550"
    }
    isis {
        interface eth1 {
        }
        interface eth2 {
        }
        interface lo {
        }
        level "level-2"
        net "49.0000.0000.0000.0011.00"
        redistribute {
            ipv6 {
                static {
                    level-2 {
                    }
                }
            }
        }
    }
    segment-routing {
        interface eth1 {
            srv6 {
            }
        }
        interface eth2 {
            srv6 {
            }
        }
        srv6 {
            locator L3VPN {
                behavior-usid
                prefix "2001:db8:11:aaa::/64"
            }
        }
    }
    static {
        route6 2001:db8:11::/48 {
            blackhole {
            }
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
                encrypted-password "$6$rounds=656000$m8VAZ2zpj4RsyGMc$k/rt12kvaszRDK.4l/33V947LmptGf2b.ffr2fHznCkV4zBzFOYtZSbYaTVWCJvQ5KHLNSHSHffOLQV1dw1Sr/"
                public-keys clab {
                    key "AAAAB3NzaC1yc2EAAAADAQABAAACAQDK7C0Y0+S14M1Kaz2tXm9tcQvNE6Urhj9cjUPoKFZLux+D81/ptkU+HmQp9czAMPHu2blzClvJnq+IIOv20AO2raUHtn7zzPlF62lU8tbCBQUm6WNKEm1zLEuihkrC6TKoxPu6MWl6RzCsQodXJ6UIDluvIG12R+wgqsPGVoRAMfHFObkVDOJyYOU00yQxWJKr5GJVLbxb4e+vgY29+HxbE+CsGo9QaT88emZSPxkTxjp6qshwYRwoz9oR3Ai0CXkkrDbw1j3KFxwv9EoOoxrxWldW7ytMnSxH4fzIO07EP0iph+iHfkitbnnH2Q8JwwGn5NmKieuPrhniXgeSRgqrYdWeWkniXSH+IpIZHbojRB0DFZZfKJ7+94rcpMjKgie9Kv8X8TFZuD9kPRNDWljoxxT31Pr7jrIZ9IlieYyhccTQhpMZdA9JOVuvX824EUxSDM6sjAxQFn3BZmqH3bIShOVuBMN5j8nWgZuvKchQdDeiVAxVH11RxNRFCC+iX7iHN72sWy7DRPVfVrr3wTZDtx5yokILtlgd3ikHssq5dGF0M6q1ff7769sCd3QSdNMX04VxRPpSCownfi6YdkKjedZU6db/41O7k3QhaUmQu1cKJ6G4jyRDwp3cooS7ymyMjDRD10bcyxkHaLXPIjlpem/eD7PJ6oPxcUmPE88tsw=="
                    type "ssh-rsa"
                }
            }
        }
    }
}
vrf {
    name customer-1 {
        protocols {
            bgp {
                address-family {
                    ipv4-unicast {
                        export {
                            vpn
                        }
                        import {
                            vpn
                        }
                        rd {
                            vpn {
                                export "10.0.0.1:100"
                            }
                        }
                        redistribute {
                            connected {
                            }
                        }
                        route-target {
                            vpn {
                                export "65550:100"
                                import "65550:100"
                            }
                        }
                    }
                }
                neighbor 172.16.100.1 {
                    peer-group "CE"
                }
                parameters {
                    router-id "10.0.0.1"
                }
                peer-group CE {
                    address-family {
                        ipv4-unicast {
                        }
                    }
                    remote-as "external"
                }
                sid {
                    vpn {
                        per-vrf {
                            export "auto"
                        }
                    }
                }
                system-as "65550"
            }
        }
        table "100"
    }
}


// Warning: Do not remove the following line.
// vyos-config-version: "bgp@6:broadcast-relay@1:cluster@2:config-management@1:conntrack@6:conntrack-sync@2:container@3:dhcp-relay@2:dhcp-server@11:dhcpv6-server@6:dns-dynamic@4:dns-forwarding@4:firewall@20:flow-accounting@3:https@7:ids@2:interfaces@34:ipoe-server@4:ipsec@14:isis@3:l2tp@9:lldp@3:mdns@1:monitoring@2:nat@8:nat66@3:nhrp@1:ntp@3:openconnect@3:openvpn@4:ospf@2:pim@1:policy@9:pppoe-server@11:pptp@5:qos@3:quagga@12:reverse-proxy@3:rip@1:rpki@2:salt@1:snmp@3:ssh@2:sstp@6:system@30:vpp@3:vrf@3:vrrp@4:vyos-accel-ppp@2:wanloadbalance@4:webproxy@2"
// Release version: 2025.12.11-0021-rolling
