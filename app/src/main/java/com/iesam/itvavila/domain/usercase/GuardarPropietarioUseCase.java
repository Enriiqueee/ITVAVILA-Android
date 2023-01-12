package com.iesam.itvavila.domain.usercase;

import com.iesam.itvavila.data.PropietarioDataStore;
import com.iesam.itvavila.domain.models.Propietario;

public class GuardarPropietarioUseCase {
    private PropietarioDataStore dataStore = PropietarioDataStore.getInstance();

    public void execute(Propietario model) {
        dataStore.guardar(model);
    }
}
