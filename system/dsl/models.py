from django.db import models

class Rede(models.Model):
    nome = models.CharField(max_length=50, verbose_name='Nome da Rede')
    ssid = models.CharField(max_length=32, verbose_name='SSID')
    senha = models.CharField(max_length=16, verbose_name='Senha')

class Dispositivo(models.Model):
    mac = models.CharField(max_length=50, verbose_name='Nome da Rede')
    num_serie = models.CharField(max_length=32, verbose_name='SSID')
    rede_wifi = models.ForeignKey(Rede, on_delete=models.CASCADE)