/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.resenasjuegos.catalogojuegos;

/**
 *
 * @author mawe
 */
public class JuegoComputadora {
    private final String nombre;
  private final PegiRatingEdad pegiRatingEdad;
  private final Double presupuestoEnMillonesDlls;
  private final Integer minimoMemoriaGPUEnMB;
  private final Integer almacenamientoRequeridoEnMB;
  private final Integer ramRequeridaEnMB;
  private final Integer nucleosRequeridos;
  private final Double velocidadNucleoEnGHZ;

  public JuegoComputadora(final String nombre, 
                      final PegiRatingEdad pegiRatingEdad,
                      final Double presupuestoEnMillonesDlls,
                      final Integer minimoMemoriaGPUEnMB,
                      final Integer almacenamientoRequeridoEnMB,
                      final Integer ramRequeridaEnMB,
                      final Integer nucleosRequeridos,
                      final Double velocidadNucleoEnGHZ) {
    this.nombre = nombre;
    this.pegiRatingEdad = pegiRatingEdad;
    this.presupuestoEnMillonesDlls = presupuestoEnMillonesDlls;
    this.minimoMemoriaGPUEnMB = minimoMemoriaGPUEnMB;
    this.almacenamientoRequeridoEnMB = almacenamientoRequeridoEnMB;
    this.ramRequeridaEnMB = ramRequeridaEnMB;
    this.nucleosRequeridos = nucleosRequeridos;
    this.velocidadNucleoEnGHZ = velocidadNucleoEnGHZ;
  }

  public String getName() {
    return nombre;
  }

  public PegiRatingEdad getPegiAgeRating() {
    return pegiRatingEdad;
  }

  public Double getBudgetInMillionsOfDollars() {
    return presupuestoEnMillonesDlls;
  }

  public Integer getMinimumGpuMemoryInMegabytes() {
    return minimoMemoriaGPUEnMB;
  }

  public Integer getDiskSpaceNeededInGB() {
    return almacenamientoRequeridoEnMB;
  }

  public Integer getRamNeededInGb() {
    return ramRequeridaEnMB;
  }

  public Integer getCoresNeeded() {
    return nucleosRequeridos;
  }

  public Double getCoreSpeedInGhz() {
    return velocidadNucleoEnGHZ;
  }
    
}
