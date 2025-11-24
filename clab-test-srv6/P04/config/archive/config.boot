interfaces {
    ethernet eth0 {
        address "172.20.20.14/24"
        address "3fff:172:20:20::8/64"
        description "Management Interface"
    }
    ethernet eth1 {
        description "Link to P03"
    }
    ethernet eth2 {
        description "Link to P02"
    }
    ethernet eth3 {
        description "Link to PE02"
    }
    loopback lo {
    }
}
pki {
    ca clab {
        certificate "MIIDhzCCAm+gAwIBAgICB+MwDQYJKoZIhvcNAQELBQAwVTELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGTAXBgNVBAMTEHRlc3Qtc3J2NiBsYWIgQ0EwHhcNMjUxMTI0MTMwODE5WhcNMjYxMTI0MTMwODE5WjBVMQswCQYDVQQGEwJVUzEJMAcGA1UEBxMAMRUwEwYDVQQKEwxjb250YWluZXJsYWIxCTAHBgNVBAsTADEZMBcGA1UEAxMQdGVzdC1zcnY2IGxhYiBDQTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBANAQffWys00YehPMQQCT0srIFdeoSnIyMFFbSPf6qQtrKpcfRv8D3n5+3ZHwlobTqJkakQGe4w2ffcSnZkLZJSrhUKnc8yM9/5OiYRKwJZCOf4hH4KXzQooyE7mxNshRAkm3BMe9FZE5hor765WxROzQhv4r3Gs+80bFUbD19qzbyeW5kiTYTfDI8WBORK18eQAGW+zOu9a1y6OjhNO5JcLvEAjNgQezYimynneS/l81UMEydKVg0jhT4My22FSr3SiDjUyFo6ows2t3UeqgHWPW51c+3/UZomuSKG09ylDciEi0AuHCQ7rqgn2ZC5kUZUWlEMn4AncwHXe+864MyVkCAwEAAaNhMF8wDgYDVR0PAQH/BAQDAgKEMB0GA1UdJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcDATAPBgNVHRMBAf8EBTADAQH/MB0GA1UdDgQWBBTH1kcCQkfatkihc5IyESfZPo7DCjANBgkqhkiG9w0BAQsFAAOCAQEAZa02+feTpzEPMoJdZs/zqqnYT4FvUgFef9OPSKX9l82JmKx/3vnuxoWaH1IjkoWmy9qMlkGlSyHIYZYBEvjkjbDTU623OP85F+3u8AURKOVP76q4nRgOyiSACUXORL6OaHsI5I23RVu2NU2zAUMWXPFZSJKz0HqFoN+JeuVhjq3Nw4wIcTl/+unsps3f6tNACZsrrsPYMF2NBB4J40YGaivlogKKTcz728kHGhehxbk8bS6kbo26ZnhRD2bTpTnVGJcXkcPSyKaCixZ7n2Z9GyrsS7hHwJwD2diNIrNS6A5YRdBHPuTKos0twzmkAhTjxQMMQqIOmHmzlZ5B1oHr+Q=="
    }
    certificate self {
        certificate "MIIDxjCCAq6gAwIBAgICBnowDQYJKoZIhvcNAQELBQAwVTELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGTAXBgNVBAMTEHRlc3Qtc3J2NiBsYWIgQ0EwHhcNMjUxMTI0MTMwODIwWhcNMjYxMTI0MTMwODIwWjBVMQswCQYDVQQGEwJVUzEJMAcGA1UEBxMAMRUwEwYDVQQKEwxjb250YWluZXJsYWIxCTAHBgNVBAsTADEZMBcGA1UEAxMQUDA0LnRlc3Qtc3J2Ni5pbzCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAOJmNHl0f48+jhQsBomoifgY6o6XEVIm54S8fhooAaIVD9Fav3o9teV5oTOMPlySrz9+iMomCVRhmnrGXXTAnXuLaUw2mVjmt+aKgMZSsjxG5Z5l8mcvjtpZMOn18s+0I8LeuoD0v0EY7E9Rav+EVlzPfyy0WaIvpIHEbYJUzD1wcqRwOPXFmXbEGnA12s7yCRgGR8o8UXTj1BPjoPoyYaCohMK/pzTzU/NKSVGexURq+fm2HSsxaG7Nz+nqhbRUJqG/dqmjjfPnaYY7LVcSIzpWYiygj3EqAQHcYgl6mXN9uCY15gB9PYLUGPKfRvYxg+q/FiJv3ab6Zc4Fcevs2QkCAwEAAaOBnzCBnDAOBgNVHQ8BAf8EBAMCBaAwHQYDVR0lBBYwFAYIKwYBBQUHAwIGCCsGAQUFBwMBMA4GA1UdDgQHBAUBAgMEBjAfBgNVHSMEGDAWgBTH1kcCQkfatkihc5IyESfZPo7DCjA6BgNVHREEMzAxggNQMDSCEmNsYWItdGVzdC1zcnY2LVAwNIIQUDA0LnRlc3Qtc3J2Ni5pb4cErBQUDjANBgkqhkiG9w0BAQsFAAOCAQEAsie8alCTV/ig15iQxNrqKOvnmlr24+MyqN6ZZV0h6YJiR/JFL+MbiXWMDAClHF6ix4195XT58TQ9JmnS6jdR2c+a4PmOyuRvMcPPptuchCAWjH/KQjlZgBWD6liXQVe7JcUXw9bR03e9WR3PJEKWa0YhMtl00whVhnpiI48Dm3O0rmE5VaxUDLGdl0V+JwTYN+5JzITqU856CmbUt0IYFTI/y2aecBYbMu63qN/f/t4cj26aUHJAjb3Ym9avpa4qbLl3wPt7apykOQbviaZNHc6Gw3YenXjch4P+04EDum8OKPg078yMJnlTt7TIxeDsd58vHovOgZ5S9FcWuvGNRA=="
        private {
            key "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDiZjR5dH+PPo4ULAaJqIn4GOqOlxFSJueEvH4aKAGiFQ/RWr96PbXleaEzjD5ckq8/fojKJglUYZp6xl10wJ17i2lMNplY5rfmioDGUrI8RuWeZfJnL47aWTDp9fLPtCPC3rqA9L9BGOxPUWr/hFZcz38stFmiL6SBxG2CVMw9cHKkcDj1xZl2xBpwNdrO8gkYBkfKPFF049QT46D6MmGgqITCv6c081PzSklRnsVEavn5th0rMWhuzc/p6oW0VCahv3apo43z52mGOy1XEiM6VmIsoI9xKgEB3GIJeplzfbgmNeYAfT2C1Bjyn0b2MYPqvxYib92m+mXOBXHr7NkJAgMBAAECggEAHShtnLDY1uGHGej7pJIMxuOqndet9uckzS8bjJHXeAD/awalf4BgI2BRVxq6U2De6i4JPwO8Et6JL0PJ+IXwIl+3nYWwpUb9q1buM9ylsOaunwJhQFHbM5rmFlPDRGXebzQRUBd1ZFRp5uNFBQiNuOFObzsBCkbZiI78TZtPPKA3RfOu0+P/IszdbtLUqV7GmFky+wu4OiMfx8togFnsA6rdemNRi1CWsX3XFxLce1DMMZr+DLmi2vFvNE0lHY9o1hklD9wWk/O78IegbWUIulpueg/UyX+G78HZ5nQW9tKTEPPJtOcEJ4dQb10rOxyLz627WLUt9cMHr38KttlJawKBgQDlXq+5YDZJZmblFXfHiHIf3epfzL0wMkJ6DrvCVLV/5FbeWCrv2ZKESnTlBwcyZBlLupQdC3iTQiKEmO6NyxJ8+naDKh5cKTFYucaALQI+gl2edj1jDisFztoob/Q3aSu1Bv3zUthhpL3pD+aSxYjcM6/9Ym4D9bfTVEOLfmgHtwKBgQD8rznHhk8mH65CFlsIhG9xY7pa5yrs+cwicWXLZOrsRccouKgJ2bLK9LfVLp06hQw5ijV/eQnAJ0baIgm9oDyCf0ulSs1htkJj9JSN9EIGbw2+KYp4bdg4twa5ZqGus7JjledyiyrPNBKzQSKwY+xWui6AqYwPEy48zs+Wc3alPwKBgEgyztNmIpBmKFtRr5tiKrI3MzAmjSKfn2c2PgnEikEQifuA+zr2XHVBzpvM44oMEh5RQ5AE7VZFCgJ89RIy6sXmPOm6l0XhPYQ1LfNot30fogJgK6CDdC1m2CrEWrYaZ8Sax9MQr8XEinbTJ3vpq9PMfUgf9ItQjCV8L6q4BlzvAoGBAL0ONYLNQKbbiTu1EkNbIy6JWULuNrW7aDpU8b6uMP66bnpPPpqwIQ+s7WY5TDYembjraX+Ihf0Y5fALC5KvMtbIe0aeou/6t82ljwhuun+p03R2DD5yoRY+Cm/pFAtsM4pC/Do9WbhR07P+hf/Ho2p4PpbRRBN7XFruuW5t0VVtAoGAfqJq6D3jiG1e3NlrIGsJbbRbtsmrzrIO5FydVfpviy3ARlJ5hFIhNMX/2oyruF9J4dWES4Lzwo3Bn6rypc3S5m8N/IZuXGu0zGIWWCN/9giDXJPoEaYq/GDroSl8d91MjqPOjrsLIOJupimZ7rbW9EYm29zNZOJOGk+GYWzh6x4="
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
        net "49.0000.0000.0000.0004.00"
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
    host-name "P04"
    login {
        user admin {
            authentication {
                encrypted-password "$6$rounds=656000$CuiqiIATCqZRbb35$hAErMdi4dmA/mjaEisJ9Bgzh5DKU4UrohMvdjEGgVESP2eL1JlDjIaVu/tQdUPI8rOHfyJNbhN8o71y2WHIrZ0"
                public-keys clab {
                    key "AAAAB3NzaC1yc2EAAAADAQABAAABgQCrNNRvXqLqgzLt/RnlXU5HGKIjhQWlW5hr0OCJz8zMR9TeraWe+pOehLlzhJQ4Nd9SF/7mekT2jQitbv47Nrb9p2FRAnoxRVWuGXc+tPsa8tlZnV9cVZ7EBaxRU27xBmU0bfLI8u08/atsCsri30nPoZj0MvGMLHDnp++FA+3NM/3WNOdv+eJ06H0KNmW8swq/tzkWbX+OmxCG3FDs9l0Q1mcMVePHwCy1AwClkcd3bOpIcvQ6h49wBlTwoKK8tmcbuT62wkN2AWEcYwTHgul1P0JTtUbYylX+q5lBqMcZm0YWJMY2idyGHLyOCPNaV+YdiegvnIqyKLfiUEQ3nyUQK9KpiNQs2xFZ5TUg26wzZpvAyzRpLYlycw3L6Rc82fKxO60ZgZsmvtzYEga8Cp+KMMdOhbzBxn5rRy1pTp7CgVFLldEL9i2HBzaJEqwbsC5DdjzxoU0wYUq/jvBfGY8wutQHp2txCaMGUOA/GEYPUuzKQRFj5JgKwYkMxZ0oock="
                    type "ssh-rsa"
                }
            }
        }
    }
}


// Warning: Do not remove the following line.
// vyos-config-version: "bgp@6:broadcast-relay@1:cluster@2:config-management@1:conntrack@6:conntrack-sync@2:container@3:dhcp-relay@2:dhcp-server@11:dhcpv6-server@6:dns-dynamic@4:dns-forwarding@4:firewall@19:flow-accounting@1:https@7:ids@1:interfaces@33:ipoe-server@4:ipsec@13:isis@3:l2tp@9:lldp@3:mdns@1:monitoring@2:nat@8:nat66@3:ntp@3:openconnect@3:openvpn@4:ospf@2:pim@1:policy@8:pppoe-server@11:pptp@5:qos@2:quagga@11:reverse-proxy@3:rip@1:rpki@2:salt@1:snmp@3:ssh@2:sstp@6:system@29:vrf@3:vrrp@4:vyos-accel-ppp@2:wanloadbalance@4:webproxy@2"
// Release version: 1.5-stream-2025-Q2
