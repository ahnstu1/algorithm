import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Main{
    
    public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");
		
		String inputPokemon;
		
		Map<String, Integer> pokemonMap = new HashMap<String, Integer>();
		
		List<String> pokemonList = new ArrayList<String>();
		
		for(int i = 0; i < Integer.parseInt(input[0]); i++) {
			
			inputPokemon = br.readLine();
			pokemonMap.put(inputPokemon, i);
			pokemonList.add(i, inputPokemon);
			
		}
		
		for(int i = 0; i < Integer.parseInt(input[1]); i++) {
			
			inputPokemon = br.readLine();
			if(pokemonMap.get(inputPokemon) == null) {
				
				bw.write(pokemonList.get(Integer.parseInt(inputPokemon) - 1));
				
				
			}else {
				
				bw.write(String.valueOf(pokemonMap.get(inputPokemon) + 1));
				
			}
			
			bw.newLine();
			
		}
		
		bw.close();

	}
    
}