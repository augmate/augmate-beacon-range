package com.example.BeaconRange;

import com.estimote.sdk.Beacon;

import java.util.ArrayList;

public interface IReceiveBeaconsCallbacks {
    void onReceiveNearbyBeacons(ArrayList<Beacon> beacons);
}
