node 'default' {
  package { 'nginx':
    ensure => installed,
  }
}
