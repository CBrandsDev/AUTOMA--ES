# pesquisar o porque o .py não puxa as imagens na hora de rodar a automação

import pyautogui as py
import time
from datetime import datetime, timedelta
import os

print(os.getcwd())


# automação para canhotos toda segunda feira
# Geral: gerar e baixar dois pdf's de canhotos no sistema cloud e salvar na pasta de Miguel com a data e nome correto para cada um

#  Variaveis

find = "yes" # variavel do loop
finalDate = datetime.today().date() # variavel da data de hoje
initialDate = finalDate - timedelta(days=7) # variavel da data da semana passada (7 dias atras)

# Converte as datas em strings com o formato desejado

initialDatePDF = initialDate.strftime('%d-%m-%Y') 
finalDatePDF = finalDate.strftime('%d-%m-%Y')
initialDateStr = initialDate.strftime('%d%m%Y')
finalDateStr = finalDate.strftime('%d%m%Y')

# Nome dos arquivos formatados da maneira correta para serem salvos

boletoPDF = f'BOLETOS {initialDatePDF} A {finalDatePDF}.pdf'
motosPDF = f'MOTOS {initialDatePDF} A {finalDatePDF}.pdf'

# Abrir o sistema cloud na aba canhotos -> contas a receber

py.hotkey('win')
time.sleep(0.5)
py.typewrite('edge')
py.press('enter')
time.sleep(1)
py.typewrite('https://microworkcloud.com.br/cloud/#/home')
py.press('enter')
time.sleep(3)
py.keyDown('shift')
py.scroll(-900)
time.sleep(1)
py.keyUp('shift')



while find == "yes":
    try:
        contasAReceber = py.locateOnScreen('./assets/contas_a_receber.png', grayscale=True)
        py.click(contasAReceber.x, contasAReceber.y)
        find = "no"
    except:
        time.sleep(1)
        print('Cannot find')


# Abrir a area de canhotos e emitir os boletos da semana de segunda a segunda

find = "yes"
while find == "yes":
    try:
        abaCanhotos = py.locateCenterOnScreen('./assets/aba_canhotos.png', grayscale=True)
        py.click(abaCanhotos.x, abaCanhotos.y)
        time.sleep(3)
        find = "no"
    except:
        time.sleep(1)
        print("Cannot Find")

find = "yes"
while find == "yes":
    try:
        py.locateCenterOnScreen('./assets/confirmacao.png', grayscale=True)
        py.press('tab')
        py.press('tab')
        py.press('tab')
        py.typewrite(initialDateStr)
        py.press('tab')
        py.typewrite(finalDateStr)
        find = "no"
    except:
        time.sleep(1)
        print("Cannot Find")


# processar o relatorio e fazer o download do pdf salvando na pasta de miguel com o nome correto

find = "yes"
while find == "yes":
    try:
        processar = py.locateCenterOnScreen('./assets/processar.png', grayscale=True)
        py.click(processar.x, processar.y)
        time.sleep(3)
        find = "no"
    except:
        time.sleep(1)
        print("Cannot Find")

find = "yes"
while find == "yes":
    try:
        imprimir = py.locateCenterOnScreen('./assets/imprimir.png', grayscale=True)
        py.click(imprimir.x, imprimir.y)
        time.sleep(3)
        find = "no"
    except:
        time.sleep(1)
        print("Cannot Find")

find = "yes"
while find == "yes":
    try:
        download = py.locateCenterOnScreen('./assets/download.png', grayscale=True)
        py.moveTo(download.x, download.y)
        time.sleep(3)
        find = "no"
    except:
        time.sleep(1)
        print("Cannot Find")

find = "yes"
while find == "yes":
    try:
        escape = py.locateCenterOnScreen('./assets/escape.png', grayscale=True)
        py.moveTo(escape.x, escape.y)
        time.sleep(0.5)
        find = "no"
    except:
        time.sleep(1)
        print("Cannot Find")

find = "yes"
while find == "yes":
    try:
        pdf = py.locateCenterOnScreen('./assets/pdf.png', grayscale=True)
        py.click(pdf.x, pdf.y)
        time.sleep(3)
        find = "no"
    except:
        time.sleep(1)
        print("Cannot Find")

find = "yes"
while find == "yes":
    try:
        salvar = py.locateCenterOnScreen('./assets/salvar.png', grayscale=True)
        py.click(salvar.x, salvar.y)
        time.sleep(3)
        find = "no"
    except:
        time.sleep(1)
        print("Cannot Find")

find = "yes"
while find == "yes":
    try:
        pasta = py.locateCenterOnScreen('./assets/pasta.png', grayscale=True)
        py.click(pasta.x, pasta.y)
        pasta_path = r'M:\arquivos\MIGUEL\CANHOTOS'
        for char in pasta_path:
            py.typewrite(char)
        find = "no"
        py.press('enter')
    except:
        time.sleep(1)
        print("Cannot Find")

find = "yes"
while find == "yes":
    try:
        nome = py.locateCenterOnScreen('./assets/nome.png', grayscale=True)
        py.click(nome.x, nome.y)
        py.typewrite(boletoPDF)
        find = "no"
    except:
        time.sleep(1)
        print("Cannot Find")

find = "yes"
while find == "yes":
    try:
        save = py.locateCenterOnScreen('./assets/save.png', grayscale=True)
        py.click(save.x, save.y)
        find = "no"
    except:
        time.sleep(1)
        print("Cannot Find")

# puxar os dados das motos e fazer a mesmas funções de baixar e salvar

py.hotkey('ctrl', 'w')


find = "yes"
while find == "yes":
    try:
        home = py.locateCenterOnScreen('./assets/home.png', grayscale=True)
        py.click(home.x, home.y)
        find = "no"
    except:
        time.sleep(1)
        print("Cannot Find")

time.sleep(3)
py.keyDown('shift')
py.scroll(-900)
time.sleep(1)
py.keyUp('shift')

find = "yes"
while find == "yes":
    try:
        venda = py.locateCenterOnScreen('./assets/venda.png', grayscale=True)
        py.click(venda.x, venda.y)
        find = "no"
    except:
        time.sleep(1)
        print("Cannot Find")

find = "yes"
while find == "yes":
    try:
        abaCanhotos = py.locateCenterOnScreen('./assets/aba_canhotos.png', grayscale=True)
        py.click(abaCanhotos.x, abaCanhotos.y)
        time.sleep(3)
        find = "no"
    except:
        time.sleep(1)
        print("Cannot Find")

find = "yes"
while find == "yes":
    try:
        py.locateCenterOnScreen('./assets/confirmacao.png', grayscale=True)
        py.press('tab')
        py.press('tab')
        py.press('tab')
        py.typewrite(initialDateStr)
        py.press('tab')
        py.typewrite(finalDateStr)
        find = "no"
    except:
        time.sleep(1)
        print("Cannot Find")

find = "yes"
while find == "yes":
    try:
        processar = py.locateCenterOnScreen('./assets/processar.png', grayscale=True)
        py.click(processar.x, processar.y)
        time.sleep(3)
        find = "no"
    except:
        time.sleep(1)
        print("Cannot Find")

find = "yes"
while find == "yes":
    try:
        imprimir = py.locateCenterOnScreen('./assets/imprimir.png', grayscale=True)
        py.click(imprimir.x, imprimir.y)
        time.sleep(3)
        find = "no"
    except:
        time.sleep(1)
        print("Cannot Find")

find = "yes"
while find == "yes":
    try:
        download = py.locateCenterOnScreen('./assets/download.png', grayscale=True)
        py.moveTo(download.x, download.y)
        time.sleep(3)
        find = "no"
    except:
        time.sleep(1)
        print("Cannot Find")

find = "yes"
while find == "yes":
    try:
        escape2 = py.locateCenterOnScreen('./assets/escape2.png', grayscale=True)
        py.moveTo(escape2.x, escape2.y)
        time.sleep(0.5)
        find = "no"
    except:
        time.sleep(1)
        print("Cannot Find")

find = "yes"
while find == "yes":
    try:
        pdf2 = py.locateCenterOnScreen('./assets/pdf2.png', grayscale=True)
        py.click(pdf2.x, pdf2.y)
        time.sleep(3)
        find = "no"
    except:
        time.sleep(1)
        print("Cannot Find")

find = "yes"
while find == "yes":
    try:
        salvar = py.locateCenterOnScreen('./assets/salvar.png', grayscale=True)
        py.click(salvar.x, salvar.y)
        time.sleep(3)
        find = "no"
    except:
        time.sleep(1)
        print("Cannot Find")

find = "yes"
while find == "yes":
    try:
        pasta = py.locateCenterOnScreen('./assets/pasta.png', grayscale=True)
        py.click(pasta.x, pasta.y)
        pasta_path = r'M:\arquivos\MIGUEL\CANHOTOS'
        for char in pasta_path:
            py.typewrite(char)
        find = "no"
        py.press('enter')
    except:
        time.sleep(1)
        print("Cannot Find")

find = "yes"
while find == "yes":
    try:
        nome2 = py.locateCenterOnScreen('./assets/nome2.png', grayscale=True)
        py.click(nome2.x, nome2.y)
        py.typewrite(motosPDF)
        find = "no"
    except:
        time.sleep(1)
        print("Cannot Find")

find = "yes"
while find == "yes":
    try:
        save = py.locateCenterOnScreen('./assets/save.png', grayscale=True)
        py.click(save.x, save.y)
        find = "no"
    except:
        time.sleep(1)
        print("Cannot Find")