interfaces {
    ethernet eth0 {
        address "172.20.20.12/24"
        address "3fff:172:20:20::8/64"
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
        certificate "MIIDzjCCAragAwIBAgICBnowDQYJKoZIhvcNAQELBQAwVzELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGzAZBgNVBAMTEnBhYzQtMjAyNS0yIGxhYiBDQTAeFw0yNjAyMTUxNjAyMzFaFw0yNzAyMTUxNjAyMzFaMFcxCzAJBgNVBAYTAlVTMQkwBwYDVQQHEwAxFTATBgNVBAoTDGNvbnRhaW5lcmxhYjEJMAcGA1UECxMAMRswGQYDVQQDExJQMDIucGFjNC0yMDI1LTIuaW8wggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQDq1hF3Fyh9ghNblrJOmrfWDLUHAXb48rrP8l573OFG7yRsdVPIkNWerGFS7x7FinChXnDb+tFI2TqxvyqH1DQdyNrKyoQOl5/D9faXsmlTe323Hco9KUQ7zMQe9bLtOpGLqb1r9ABIUQH7idsF/QMkCkPCaZ9Bgm3n5IKNJts9CsM69jLwsle2NR3+eaU5XbRgLbTyuFnWGoIHhaGLCNCAU04WEz+W4hPC6XK6AR3rjMUXthcstcss0nNwEu6tcUUTXniElYfCPoCIc5lV6utxHYzx2DZB4+81V0gYNy4nBF8AQ4oaw6SdOQOIagt5ZEJrrOlkoeQyL/6ifggdwmDDAgMBAAGjgaMwgaAwDgYDVR0PAQH/BAQDAgWgMB0GA1UdJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcDATAOBgNVHQ4EBwQFAQIDBAYwHwYDVR0jBBgwFoAUuAHQ5MVNSKg3akumYIXfq7uk4dQwPgYDVR0RBDcwNYIDUDAyghRjbGFiLXBhYzQtMjAyNS0yLVAwMoISUDAyLnBhYzQtMjAyNS0yLmlvhwSsFBQMMA0GCSqGSIb3DQEBCwUAA4IBAQCSqqJbpQQXQ3WansjNBtU3AWrgxFkm8ct+jxPZz5KfgIiy4V53YFQfr3O8R/DPWh2s3UoyB0y34mlw44w+P14cpw7P5ZhCJfzZAYDXrygofWY+gtCSA/qpXgsDUNEjVMki75yFDCuh0fnXK6bAndaTyEKX3OJZuieRV0ygGVdRcaJ/5T9oEfKQAHMKqwjoaJn2h+30BauPWhb8sYIi1CfQAteT+qGTIjfLe06L0ImiiueUQNGOdGd1tsv5TVRKH5DE6Wpvk69/cj/ujOiJo+4kAITea9O10lNjd/p239HhZd0GeOqIz503/O6Euqu7rYXQAQAD8d3+riY9fHvp9Jmy"
        private {
            key "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDq1hF3Fyh9ghNblrJOmrfWDLUHAXb48rrP8l573OFG7yRsdVPIkNWerGFS7x7FinChXnDb+tFI2TqxvyqH1DQdyNrKyoQOl5/D9faXsmlTe323Hco9KUQ7zMQe9bLtOpGLqb1r9ABIUQH7idsF/QMkCkPCaZ9Bgm3n5IKNJts9CsM69jLwsle2NR3+eaU5XbRgLbTyuFnWGoIHhaGLCNCAU04WEz+W4hPC6XK6AR3rjMUXthcstcss0nNwEu6tcUUTXniElYfCPoCIc5lV6utxHYzx2DZB4+81V0gYNy4nBF8AQ4oaw6SdOQOIagt5ZEJrrOlkoeQyL/6ifggdwmDDAgMBAAECggEACcpo/1UTgWq7PItOMyFs3rC4RMAr4fnaDgdl0bYwx5ClgnFrJSaHXCPbCZEh8Exy9ldbTzXoJH23XmfA8dlytCHb9VkiI6rwpJk28bYk1q/ZsEO+sHQYUyyYqfhxFZuRK93Pduu9A0bVVVO3B6CNJqMtlge/SwTmviSfHhwWRzd83gAcyICVrliiA60XvvovEIv14PwQiu532kP+DqaMpouqI99f4B/mCPLJ/A92m2lc043DPIhWPnC2UZ3W6DrA7w+JzO8JmkaKt2Uuh4honXDbf2P4mHol8WOhvqyKZ3dNTgc8lg90KfpqBngLrgtpqpLKMDmkxQnIQ8QjW60E2QKBgQDt+2174wWS1CEyAdCUCMSbVgeVypUXgrmMnrHpzwgYE+GtqNPqi/AwxtI/TMraVz5br4ocBHtcf5i7LNWO+m2Gqw5c9hVJvBtWToTrsqSdOq3ZeatcsK1PcO31f80blFoxA4KhWLGSEhwbD+QwJzM495vplT+moIingIGX04spLwKBgQD8nap+969gE3yq92dRVOUcKCDVxOweSRpNoW6XyZAKzUruBDtjtKzJ86y9qznTAOYr+8bIASLHvKhcwaXSz190KF7EmMKGy0DlxiM3PJ/UrQnU3QHYnpquDUgkkER+kaFk3ED9/59/D8pNS5MtqyjpqV25igEc3mYaDl3WFsY0rQKBgAQ6/PY/0eCLTs/BwoBvK3eLbvUVtdLGKyA5zfXXDVDIQbHBl4rK1Ak575Daf5ykAmLE2xKmbb72MbPaFy3Ee9/x+H5kjXpTErVVDf3WniCBY4fDJu2t4lbQLhq4G+BKodPPOSo/FmD/W2qLvMWyXLG9jRL46TnADs3TdfpJ82ZXAoGBAPXQBkQeiI0Y6UsEC4lc7sSDV9AsGwctY2b/GzqgbIXWVn9dptzSxwCNGR5HK7FjQpayHTApyspJjhsUZGPKXrwNPIpZi5DW34O3VjU9zNmKt/JmTJGZZDLRwc2yhLQUydP3b1a6E13044prbAAYeWtF32nYHFUXJIteR3k4GA7RAoGBANpxrO0twwW307gjovQkYH/efmWEVw5rJrw7bZUzE9qiK2+7tX+xXe/1G6vdUgSKVCuY292UAHu4STOrViQdXmDyDVSe5/PktVMZAlGVZl5XgSu4Ku+unR0N87bYfmv84kQm9ts28wBtfH0gNQwhxre6xu90Bk0dTwYr08A+zk2L"
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
    host-name "P02"
    login {
        user admin {
            authentication {
                encrypted-password "$6$rounds=656000$GDK3SeGISihJBpVw$S5QnzPSAHA4K7NewytSqInuL7wOGGwFpln67yqBTxkes/T.iavFmr.CFSPIWMWkd7dunb8j6XLVnf11A96.U21"
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
