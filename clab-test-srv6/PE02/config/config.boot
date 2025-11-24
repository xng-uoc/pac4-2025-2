interfaces {
    ethernet eth0 {
        address "172.20.20.22/24"
        address "3fff:172:20:20::2/64"
        description "Management Interface"
    }
    ethernet eth1 {
        description "Link to P02"
    }
    ethernet eth2 {
        description "Link to P04"
    }
    ethernet eth3 {
        address "172.16.200.2/24"
        address "fd01:100:2a::2/64"
        description "CE2"
        vrf "customer-1"
    }
    loopback lo {
        address "2001:db8::12/128"
    }
}
pki {
    ca clab {
        certificate "MIIDhzCCAm+gAwIBAgICB+MwDQYJKoZIhvcNAQELBQAwVTELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGTAXBgNVBAMTEHRlc3Qtc3J2NiBsYWIgQ0EwHhcNMjUxMTI0MTMwODE5WhcNMjYxMTI0MTMwODE5WjBVMQswCQYDVQQGEwJVUzEJMAcGA1UEBxMAMRUwEwYDVQQKEwxjb250YWluZXJsYWIxCTAHBgNVBAsTADEZMBcGA1UEAxMQdGVzdC1zcnY2IGxhYiBDQTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBANAQffWys00YehPMQQCT0srIFdeoSnIyMFFbSPf6qQtrKpcfRv8D3n5+3ZHwlobTqJkakQGe4w2ffcSnZkLZJSrhUKnc8yM9/5OiYRKwJZCOf4hH4KXzQooyE7mxNshRAkm3BMe9FZE5hor765WxROzQhv4r3Gs+80bFUbD19qzbyeW5kiTYTfDI8WBORK18eQAGW+zOu9a1y6OjhNO5JcLvEAjNgQezYimynneS/l81UMEydKVg0jhT4My22FSr3SiDjUyFo6ows2t3UeqgHWPW51c+3/UZomuSKG09ylDciEi0AuHCQ7rqgn2ZC5kUZUWlEMn4AncwHXe+864MyVkCAwEAAaNhMF8wDgYDVR0PAQH/BAQDAgKEMB0GA1UdJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcDATAPBgNVHRMBAf8EBTADAQH/MB0GA1UdDgQWBBTH1kcCQkfatkihc5IyESfZPo7DCjANBgkqhkiG9w0BAQsFAAOCAQEAZa02+feTpzEPMoJdZs/zqqnYT4FvUgFef9OPSKX9l82JmKx/3vnuxoWaH1IjkoWmy9qMlkGlSyHIYZYBEvjkjbDTU623OP85F+3u8AURKOVP76q4nRgOyiSACUXORL6OaHsI5I23RVu2NU2zAUMWXPFZSJKz0HqFoN+JeuVhjq3Nw4wIcTl/+unsps3f6tNACZsrrsPYMF2NBB4J40YGaivlogKKTcz728kHGhehxbk8bS6kbo26ZnhRD2bTpTnVGJcXkcPSyKaCixZ7n2Z9GyrsS7hHwJwD2diNIrNS6A5YRdBHPuTKos0twzmkAhTjxQMMQqIOmHmzlZ5B1oHr+Q=="
    }
    certificate self {
        certificate "MIIDyjCCArKgAwIBAgICBnowDQYJKoZIhvcNAQELBQAwVTELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGTAXBgNVBAMTEHRlc3Qtc3J2NiBsYWIgQ0EwHhcNMjUxMTI0MTMwODIwWhcNMjYxMTI0MTMwODIwWjBWMQswCQYDVQQGEwJVUzEJMAcGA1UEBxMAMRUwEwYDVQQKEwxjb250YWluZXJsYWIxCTAHBgNVBAsTADEaMBgGA1UEAxMRUEUwMi50ZXN0LXNydjYuaW8wggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQDI4jOgqpUk7xaaozZx5rZqlCQJPA4x3u+Axyxs4iLa28wATz7hbdXSVhDbCkRfLkKfr63RbtgsVXSmhFe/iO0Bn1tjmvDPxVy5MSRkL8+j5Ti17eRUvG+tEN6IASpu/EdTbBURiFE41flCVnlqabML6TtDB4WqNoKLbIOh5HD/ZQYwfDTbzYYyD3jfTDmPwZcj3mjCRrvkhxehLt4AtjnaXkt4unEZbEalfUUpcAf196vic4x33/T12YC6QJ4fzkbODKwj71NBy+x5OxXFNHqroQI4g1xBGzEhWZay+3DBQvn9NXYAbe0/UDvEYxKDR8Ct8AbeR1KLSNbXt1mS8bjVAgMBAAGjgaIwgZ8wDgYDVR0PAQH/BAQDAgWgMB0GA1UdJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcDATAOBgNVHQ4EBwQFAQIDBAYwHwYDVR0jBBgwFoAUx9ZHAkJH2rZIoXOSMhEn2T6OwwowPQYDVR0RBDYwNIIEUEUwMoITY2xhYi10ZXN0LXNydjYtUEUwMoIRUEUwMi50ZXN0LXNydjYuaW+HBKwUFBYwDQYJKoZIhvcNAQELBQADggEBAGaUAnrJHyHiAaEoeW+UCmiMVBf1djYhdZWjilBz32XhuM4O9GXy2m8305FBV7yiRCT69gC85yVtWAJFZaIAAu3UzP8ZUDllLOfx1GzLDGE4DERq4t7aqWHBScElBNtqWzZHLUEiLlemEXFFiTZ8mEEEmqzitW4HQBRLjY0yMop7gSlkIQy3nj6gLNfNzp0x2ByKx0tZrRfgrCUn0IcppB3GVaZT6QeAmhVXnKT2n4D6AlkAG8nOX71CywlyvrK+PnZw+wBU57BVE/sxtvq/VXflLSirMuQEuoQLUd986hpIWX2WWefAb/vd4nF3snQ7QyoDuNu5qPNwoEYr3nZVZSs="
        private {
            key "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDI4jOgqpUk7xaaozZx5rZqlCQJPA4x3u+Axyxs4iLa28wATz7hbdXSVhDbCkRfLkKfr63RbtgsVXSmhFe/iO0Bn1tjmvDPxVy5MSRkL8+j5Ti17eRUvG+tEN6IASpu/EdTbBURiFE41flCVnlqabML6TtDB4WqNoKLbIOh5HD/ZQYwfDTbzYYyD3jfTDmPwZcj3mjCRrvkhxehLt4AtjnaXkt4unEZbEalfUUpcAf196vic4x33/T12YC6QJ4fzkbODKwj71NBy+x5OxXFNHqroQI4g1xBGzEhWZay+3DBQvn9NXYAbe0/UDvEYxKDR8Ct8AbeR1KLSNbXt1mS8bjVAgMBAAECggEAA7dOKy+x+JqaTsasJX6WFfH4RK92t8Ie/haGd4aAtzm6VAXN7PpM1UpASj0DYhtcoiWWz+P+sxCVoCrx5e97gDyEF/CazyJ116XVaCu2P0WTP1JPl1MGYdYzt6JbOEMJyBJHcClBug0Yl6XlMxcSIoCbAbTBlTzS52SyKVbXfEdIEzgCJapGZhTBuzqOfMXo/Pd4MqnMkiSLdlHwsv4Db0v/vXhJuHCS3u3mTs4jlT1xCjRxpu670sYwx6gHTfs015wNLcEc29cL+rNU7d6BgBfPt/wcC6gP0AkKoYs+P9G1uvJNzlYp82EbOXNF61uyOpB1sDWLcxEQx84tZ27pwQKBgQDZSvUNU4g6Jq3SrMpHjA402BbH4LZo/k9euNIlIyeWkMQXHS2WwVzi14CcTkdbZLcoGJhGjv96HZuDW1kL9gYLWRvSBs6ny/otwspuyWfy8t/clW0kgzMPAFGavIzfvngAAw6cn8E3B//ERxWXaEFaKjpXyHokhuzxLfuMIjxGhQKBgQDsqvKhKSh+uAJ0S6VFAJcRclN0Oi63kOIk1yxKlQxUmVSVUr7twhJ94fSD0vhOYQgBOT+bEdTY2IVQ9Aawx5/L7mHMbd8CZiSPHRHrE5GJovBYtg6uCuNjf6m8NWKS5fFKyM2CUEfbIBMIFsiUzfYWW7mSgd4lFucn/tdZqhQCEQKBgE+01z8ULRxno8tr5qdoEK4BthmLrF3HK4Yrdap5wsPQRp3T7i0msNPlCSBM9o/n2eezXehD/CLnSWxdzcQ9cuomvbXFGXkjsZmnomoRJzhPLx7TET4bglc2XrjMAUDxtUML3AhH8bAmFwQAr0Li01Ynt08MEwHjHHc7ztIQnNuhAoGBALyQF3DAUjtkcNAn1S39ImAMLuHT2ZT4IrYnmmpyBrkA0ZuHqgfVMNaLST4ewSfxt2cCLeNneaasHMw7IXmIE5FwBQvUHnLS3x4Hk1cw6Cw5XjXQGDIjCrkj5iDGiBtyiaWEB/lj7VxxWbiALqAg2YlG27wXLN9wOAxtxzbxg6+BAoGAOJg+/QU9exaPSv79xn490vzRtrH1PImiWn8en+IP1wAom7k0ENEUCKaOVCW4r/QcRmNdGMVEjXUziEDFekgin0Cp1TgzkhUvtGWbQ7S2JBagd7li2qQ6KeTZGTL3OCyhqhmjrPVd4po9mmw3CSaJE+MYhO7iM16El2f66KXJz68="
        }
    }
}
policy {
    local-route6 {
        rule 100 {
            destination {
                address "2001:db8:11::/48"
            }
            set {
                table "main"
            }
            source {
                address "2001:db8::12/128"
            }
        }
    }
}
protocols {
    bgp {
        neighbor 2001:db8::11 {
            description "PE01"
            peer-group "SRv6"
        }
        parameters {
            router-id "12.12.12.12"
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
        net "49.0000.0000.0000.0012.00"
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
                prefix "2001:db8:12:aaa::/64"
            }
        }
    }
    static {
        route6 2001:db8:12::/48 {
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
    host-name "PE02"
    login {
        user admin {
            authentication {
                encrypted-password "$6$rounds=656000$ElGOWo4ZXMyxmD6e$YXe6YLORCT4rdnk8XS5fEEq/1LOsY7KciOX2XNjSu7A4Fyhd4sWkvvG9VGeR2u5VwcNrcgTZnWB3U1LJ84jEg."
                public-keys clab {
                    key "AAAAB3NzaC1yc2EAAAADAQABAAABgQCrNNRvXqLqgzLt/RnlXU5HGKIjhQWlW5hr0OCJz8zMR9TeraWe+pOehLlzhJQ4Nd9SF/7mekT2jQitbv47Nrb9p2FRAnoxRVWuGXc+tPsa8tlZnV9cVZ7EBaxRU27xBmU0bfLI8u08/atsCsri30nPoZj0MvGMLHDnp++FA+3NM/3WNOdv+eJ06H0KNmW8swq/tzkWbX+OmxCG3FDs9l0Q1mcMVePHwCy1AwClkcd3bOpIcvQ6h49wBlTwoKK8tmcbuT62wkN2AWEcYwTHgul1P0JTtUbYylX+q5lBqMcZm0YWJMY2idyGHLyOCPNaV+YdiegvnIqyKLfiUEQ3nyUQK9KpiNQs2xFZ5TUg26wzZpvAyzRpLYlycw3L6Rc82fKxO60ZgZsmvtzYEga8Cp+KMMdOhbzBxn5rRy1pTp7CgVFLldEL9i2HBzaJEqwbsC5DdjzxoU0wYUq/jvBfGY8wutQHp2txCaMGUOA/GEYPUuzKQRFj5JgKwYkMxZ0oock="
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
                                export "10.0.0.2:100"
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
                neighbor 172.16.200.1 {
                    peer-group "CE"
                }
                parameters {
                    router-id "10.0.0.2"
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
// vyos-config-version: "bgp@6:broadcast-relay@1:cluster@2:config-management@1:conntrack@6:conntrack-sync@2:container@3:dhcp-relay@2:dhcp-server@11:dhcpv6-server@6:dns-dynamic@4:dns-forwarding@4:firewall@19:flow-accounting@1:https@7:ids@1:interfaces@33:ipoe-server@4:ipsec@13:isis@3:l2tp@9:lldp@3:mdns@1:monitoring@2:nat@8:nat66@3:ntp@3:openconnect@3:openvpn@4:ospf@2:pim@1:policy@8:pppoe-server@11:pptp@5:qos@2:quagga@11:reverse-proxy@3:rip@1:rpki@2:salt@1:snmp@3:ssh@2:sstp@6:system@29:vrf@3:vrrp@4:vyos-accel-ppp@2:wanloadbalance@4:webproxy@2"
// Release version: 1.5-stream-2025-Q2
