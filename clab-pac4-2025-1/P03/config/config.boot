interfaces {
    ethernet eth0 {
        address "172.20.20.13/24"
        address "3fff:172:20:20::3/64"
        description "Management Interface"
    }
    ethernet eth1 {
        description "Link to P04"
    }
    ethernet eth2 {
        description "Link to P01"
    }
    ethernet eth3 {
        description "Link to PE01"
    }
    loopback lo {
    }
}
pki {
    ca clab {
        certificate "MIIDhzCCAm+gAwIBAgICB+MwDQYJKoZIhvcNAQELBQAwVTELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGTAXBgNVBAMTEHRlc3Qtc3J2NiBsYWIgQ0EwHhcNMjUxMTI0MTMwODE5WhcNMjYxMTI0MTMwODE5WjBVMQswCQYDVQQGEwJVUzEJMAcGA1UEBxMAMRUwEwYDVQQKEwxjb250YWluZXJsYWIxCTAHBgNVBAsTADEZMBcGA1UEAxMQdGVzdC1zcnY2IGxhYiBDQTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBANAQffWys00YehPMQQCT0srIFdeoSnIyMFFbSPf6qQtrKpcfRv8D3n5+3ZHwlobTqJkakQGe4w2ffcSnZkLZJSrhUKnc8yM9/5OiYRKwJZCOf4hH4KXzQooyE7mxNshRAkm3BMe9FZE5hor765WxROzQhv4r3Gs+80bFUbD19qzbyeW5kiTYTfDI8WBORK18eQAGW+zOu9a1y6OjhNO5JcLvEAjNgQezYimynneS/l81UMEydKVg0jhT4My22FSr3SiDjUyFo6ows2t3UeqgHWPW51c+3/UZomuSKG09ylDciEi0AuHCQ7rqgn2ZC5kUZUWlEMn4AncwHXe+864MyVkCAwEAAaNhMF8wDgYDVR0PAQH/BAQDAgKEMB0GA1UdJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcDATAPBgNVHRMBAf8EBTADAQH/MB0GA1UdDgQWBBTH1kcCQkfatkihc5IyESfZPo7DCjANBgkqhkiG9w0BAQsFAAOCAQEAZa02+feTpzEPMoJdZs/zqqnYT4FvUgFef9OPSKX9l82JmKx/3vnuxoWaH1IjkoWmy9qMlkGlSyHIYZYBEvjkjbDTU623OP85F+3u8AURKOVP76q4nRgOyiSACUXORL6OaHsI5I23RVu2NU2zAUMWXPFZSJKz0HqFoN+JeuVhjq3Nw4wIcTl/+unsps3f6tNACZsrrsPYMF2NBB4J40YGaivlogKKTcz728kHGhehxbk8bS6kbo26ZnhRD2bTpTnVGJcXkcPSyKaCixZ7n2Z9GyrsS7hHwJwD2diNIrNS6A5YRdBHPuTKos0twzmkAhTjxQMMQqIOmHmzlZ5B1oHr+Q=="
    }
    certificate self {
        certificate "MIIDxjCCAq6gAwIBAgICBnowDQYJKoZIhvcNAQELBQAwVTELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGTAXBgNVBAMTEHRlc3Qtc3J2NiBsYWIgQ0EwHhcNMjUxMTI0MTMwODIwWhcNMjYxMTI0MTMwODIwWjBVMQswCQYDVQQGEwJVUzEJMAcGA1UEBxMAMRUwEwYDVQQKEwxjb250YWluZXJsYWIxCTAHBgNVBAsTADEZMBcGA1UEAxMQUDAzLnRlc3Qtc3J2Ni5pbzCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBANa2IZGLhfbqQuYL/s6pkXRteH5XMkDtbNuTsYepd7clOp6IN0SjBbmshsAi1jxeIR9J435lvGrmIqLbIiMy6PLCeNTMnhlMaU+3HWlcVYrJTyEhJKKF4sSJ5iFWc8yZLLFvniLs6lgR851fuiK6aQ49twy0pqsee3QrdLEyUs1c7sdaZ7AQroOcPkx/AgEbWMViS4fn7AWEgdp8GW4AEpHK8U2+rfr6uJO1onjeNjwWwDxCYRNlNrbUqNe4XLjREzkoJt6pud909tL6DL91/KyUOD+2ojzEgMTCyUvOiyC+25OTxy5dSNdNT4MzuQk5BbLMidCgk861Q/5y/IeF1zECAwEAAaOBnzCBnDAOBgNVHQ8BAf8EBAMCBaAwHQYDVR0lBBYwFAYIKwYBBQUHAwIGCCsGAQUFBwMBMA4GA1UdDgQHBAUBAgMEBjAfBgNVHSMEGDAWgBTH1kcCQkfatkihc5IyESfZPo7DCjA6BgNVHREEMzAxggNQMDOCEmNsYWItdGVzdC1zcnY2LVAwM4IQUDAzLnRlc3Qtc3J2Ni5pb4cErBQUDTANBgkqhkiG9w0BAQsFAAOCAQEAvs25G3VO/Hpn/KFRpe+tzAlcth/nfKBU5iAwmKKreg7ukmxzznhk1yFCwtph83/PH6p22USTYiAv+LnyraIthYlYBRteBWuIqH0oyNI65LBfOGsGCufu2hMHEGiRwcRpUtnKRNdF2zrVBWQyp41CiB4CRJNd4oDUaSLHKOP2S3WBO1CrZGEoHpn21eZjt1rf8ZiYqwPl6N2uW6hCEnp5S4PzucUB65i4STkRcdUx9C0sMkB31466/N/F7uj7Vu6ALZYBHMnhY/hNRGs95EazeXF4eQnSY2FtVW7KYpGssqyaKOZB3oxNrfHkjPh6KFvVtYCMzDwopulUIizHeB5bOw=="
        private {
            key "MIIEuwIBADANBgkqhkiG9w0BAQEFAASCBKUwggShAgEAAoIBAQDWtiGRi4X26kLmC/7OqZF0bXh+VzJA7Wzbk7GHqXe3JTqeiDdEowW5rIbAItY8XiEfSeN+Zbxq5iKi2yIjMujywnjUzJ4ZTGlPtx1pXFWKyU8hISSiheLEieYhVnPMmSyxb54i7OpYEfOdX7oiumkOPbcMtKarHnt0K3SxMlLNXO7HWmewEK6DnD5MfwIBG1jFYkuH5+wFhIHafBluABKRyvFNvq36+riTtaJ43jY8FsA8QmETZTa21KjXuFy40RM5KCbeqbnfdPbS+gy/dfyslDg/tqI8xIDEwslLzosgvtuTk8cuXUjXTU+DM7kJOQWyzInQoJPOtUP+cvyHhdcxAgMBAAECgf8yvdgxDUgbkkE9HJibPnehjD1tni3CKloPilfqN6KTJbk0vfxRvDUeLCesQI9gtN4fBtc8h85/dOO6mQ74Qo/Kzyq/H5w9XlGFBUFuJOQSaIDK04pU3k85I12/gy7aq1hklnxIxLSdG6D3EChtDKDHPM6FsiuxRQLn8V0ig0IORfkmQn5eJEk03vC0EW6T6/hUa0qdOda8SroKbgFnCK5vbZUjlL3EyZNjTI4OQPOLuOunRrlvkldzjl2t5nVSCQ68YmoLV8G3xRq5XcEPgTJ/+pvDTrVS7FCS2xd2wZSvHjyv8OaDuMI82METvV/8bUh1+fLdkR6FujLpcBVizjkCgYEA+Lqb4IBMjQG5ObBDREAU47EBL9QHUREcoK4ysS+vIeL/RkdTyyVoa01JI/o1K3UnjHxroEWyxXV0/aKoFc4Add8wu182hIlWOzSXe2eGDDa5BVv9uP45qyCmWGI5Coyc/laO6UHDWSFTb76qzNOhY86wZVGzx7GoX2T7Q9z8JaUCgYEA3Pzy0LJd7UHAi7N4hiDZ0zjQuj1TDV2jR29TykacwCbtcZ4OTUFZ1g3UZ9Y2w7EK2UzCHP84rGXF/tbYr8TCUidvYTiLUrMZI1A6diYuUcNkQsqwkfHSLoOnYL/p8Pa6h1FsKkcPQmUiG1Rtnxax/3T+589BfXRxgrApdbWV7Z0CgYEA01iFMPrzkPFA+VLbpXeqCFsT/hb07J5Uq/e43TP+ZRXkAUyEV95+Xoa6OlbVrQqMQ2RJc1Ml94C5mvcGShjT7VRrrRrXUUD9Q6uJd/NcRK6PAo3LBtEGIXHJxtoXS+51S+wy3OLjYa3entntecPto8gxvLXyxCEiR4SfuGdi3X0CgYAONnqLb51Y4Ay5L27F+aDo09Og1sbbqjURKBjUfpwgQ6Cr2QWEdHqJqNQLZZyaE23mMeieItALTnRggoLnMxloXT7tmsxjIj+wpL1N0gDSo2V0YkLe8BWbhj4im9U4+TVf9J2nTnCtzYFXDqQKQlRqYKTwVcUZg361cA0KlAYzhQKBgAW6XzhCL/0qQgisEklOkhP+HGcoVBGLaiTFKtghINtaVyCn0ekleRwe2vqaZeSt8gvihDYObQapaSfbiK1UTxZebuoY2YzPP31q46hWBxpXVJoz6AvAiSOxNkVXksZhSZ+rrviUyjCU44OhK6FueABPXV7VmrVsTKgMR8LVv5za"
        }
    }
}
protocols {
    isis {
        interface eth1 {
        }
        interface eth2 {
        }
        interface eth3 {
        }
        level "level-2"
        net "49.0000.0000.0000.0003.00"
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
                encrypted-password "$6$rounds=656000$xkqtpcuYp5MD7h7b$.vGkeS5Lffw8W7w2tz6DowQp1scHxeThWrS/OnCykGIZAoBZ4oMyPgkpvVDZWy1rYIX8dfqOIS76iPS4gZXLf."
                public-keys clab {
                    key "AAAAB3NzaC1yc2EAAAADAQABAAACAQDK7C0Y0+S14M1Kaz2tXm9tcQvNE6Urhj9cjUPoKFZLux+D81/ptkU+HmQp9czAMPHu2blzClvJnq+IIOv20AO2raUHtn7zzPlF62lU8tbCBQUm6WNKEm1zLEuihkrC6TKoxPu6MWl6RzCsQodXJ6UIDluvIG12R+wgqsPGVoRAMfHFObkVDOJyYOU00yQxWJKr5GJVLbxb4e+vgY29+HxbE+CsGo9QaT88emZSPxkTxjp6qshwYRwoz9oR3Ai0CXkkrDbw1j3KFxwv9EoOoxrxWldW7ytMnSxH4fzIO07EP0iph+iHfkitbnnH2Q8JwwGn5NmKieuPrhniXgeSRgqrYdWeWkniXSH+IpIZHbojRB0DFZZfKJ7+94rcpMjKgie9Kv8X8TFZuD9kPRNDWljoxxT31Pr7jrIZ9IlieYyhccTQhpMZdA9JOVuvX824EUxSDM6sjAxQFn3BZmqH3bIShOVuBMN5j8nWgZuvKchQdDeiVAxVH11RxNRFCC+iX7iHN72sWy7DRPVfVrr3wTZDtx5yokILtlgd3ikHssq5dGF0M6q1ff7769sCd3QSdNMX04VxRPpSCownfi6YdkKjedZU6db/41O7k3QhaUmQu1cKJ6G4jyRDwp3cooS7ymyMjDRD10bcyxkHaLXPIjlpem/eD7PJ6oPxcUmPE88tsw=="
                    type "ssh-rsa"
                }
            }
        }
    }
}


// Warning: Do not remove the following line.
// vyos-config-version: "bgp@6:broadcast-relay@1:cluster@2:config-management@1:conntrack@6:conntrack-sync@2:container@3:dhcp-relay@2:dhcp-server@11:dhcpv6-server@6:dns-dynamic@4:dns-forwarding@4:firewall@19:flow-accounting@1:https@7:ids@1:interfaces@33:ipoe-server@4:ipsec@13:isis@3:l2tp@9:lldp@3:mdns@1:monitoring@2:nat@8:nat66@3:ntp@3:openconnect@3:openvpn@4:ospf@2:pim@1:policy@8:pppoe-server@11:pptp@5:qos@2:quagga@11:reverse-proxy@3:rip@1:rpki@2:salt@1:snmp@3:ssh@2:sstp@6:system@29:vrf@3:vrrp@4:vyos-accel-ppp@2:wanloadbalance@4:webproxy@2"
// Release version: 1.5-stream-2025-Q2
