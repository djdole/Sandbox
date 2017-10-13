file { '/tmp/hello':
  content => "Hello, world\n",
}
user { 'chronos':
  ensure => present,
}
package { 'curl':
  ensure => installed,
}